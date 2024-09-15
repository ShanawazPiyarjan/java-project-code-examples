package com.test.project;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadClass {

	public static void main(String[] args) {
		
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		ex.execute(new Runnable() {
			public void run() {
				System.out.println("Test");
			}
		});
		
	}
	
}