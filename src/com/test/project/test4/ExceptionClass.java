package com.test.project.test4;

public class ExceptionClass {

	public static void main(String[] args) {
		method1();

	}
	
	public static void method1() {
		method2();
	}
	
	public static void method2() {
		String str = null;
		str.toString();
	}

}
