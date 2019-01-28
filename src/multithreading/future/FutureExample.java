package multithreading.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 3);

		List<Future<String>> futures = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Future<String> future = executor.submit(new CallableTask());

			futures.add(future);
		}

		System.out.println("Tasks called in seperate thread");

		for (Future<String> future : futures) {
			// future.get() is blocking
			System.out.println(future.get());
		}
		executor.shutdown();
		Thread.sleep(5000);
		System.err.println(Thread.activeCount());
		System.err.println(Thread.currentThread().getName());
	}

}


