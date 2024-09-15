package com.test.project.test3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkExample {

	public static void main(String[] args) {
		
		int count = Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newFixedThreadPool(count);
		
		for (int i=0; i<100; i++) {
			executorService.execute(new Task());
		//System.out.println("Thread name T: " + Thread.currentThread().getName());
		}
		
	}
	
	public static class Task implements Runnable {
		public void run() {
			System.out.println("Thread name R: " + Thread.currentThread().getName());
		}
	}
}
