package multithreading.future;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("Task is running");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Task complete");

		return "Task complete";
	}

}
