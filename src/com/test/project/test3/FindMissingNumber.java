package com.test.project.test3;

public class FindMissingNumber {

	public static void main(String[] args) {


		int[] intArray = {1, 2, 3, 4, 5, 7, 8, 9, 10};
		
		System.out.println(intArray[0]);
		int a = intArray[0];
		int count = 0;
		
		System.out.println(intArray[intArray.length-1]);
		int b = intArray[intArray.length-1];
		
		for (int i=0; i<=intArray.length-1; i++) {
			if (intArray[i] == a) {
				//System.out.println("match");
				
			} else {
				//System.out.println("not match");
				System.out.println("Missing value is: " + a);
				a++;
			}
			a++;
		}

	}

}
