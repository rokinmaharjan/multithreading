package multithreading.executorservice;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) throws IOException {
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 3);
		
		for (int i=0; i<10; i++) {
			executor.submit(new RunnableTask());
		}
		
		System.out.println("Tasks called in seperate thread");
	}
}


