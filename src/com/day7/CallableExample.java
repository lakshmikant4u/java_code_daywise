package com.day7;

import java.util.concurrent.*;

public class CallableExample {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Callable<Integer> task = new Callable<Integer>() {
			public Integer call() throws Exception {
				return 123;
			}
		};

		Future<Integer> future = executorService.submit(task);
		Integer result = future.get(); // Blocking call to get result
		System.out.println("Task result: " + result);
		executorService.shutdown();
	}
}
