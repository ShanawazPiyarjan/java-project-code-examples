package com.test.project;

public class StringToIntClass {

	public static void main(String[] args) {

		int i = convertStringToInt("String");

		System.out.println("The int is: " + i);

	}

	private static int convertStringToInt(String string) {
		int a = 0;
		try {
			
			a = Integer.parseInt(string);
		} catch (Exception e) {
			System.out.println(e);
		}

		return a;
	}

}
