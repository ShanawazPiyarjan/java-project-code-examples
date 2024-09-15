package com.test.project.test3;

public class PredictOutput1 {

	public static void main(String[] args) {
		
		A h1 = new B();

		
		B h2 = new B();
		h2.m1(2L, 5L);
		h2.m1(1L, 2L);

	}

}

class A {
	void m1(int a, int b) {
		System.out.println("Method from A class");
		System.out.println(a+b);
	}
}

class B extends A {
	void m1(long a, long b) {
		System.out.println("Method from B class");
		System.out.println(a+b);
	}
	
	void show() {
		System.out.println("Show method");
	}
}
