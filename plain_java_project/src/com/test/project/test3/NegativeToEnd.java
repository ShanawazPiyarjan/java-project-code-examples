package com.test.project.test3;

public class NegativeToEnd {

	public static void main(String[] args) {

//		Move all negative elements to end 
//		Input :  N=8
//		arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
//		Output :
//		7  9  10  11  -5  -3  -4  -1

		int n = 8;
		int[] arr = { -5, 7, -3, -4, 9, 10, -1, 11 };
		int[] intArray = new int[arr.length];
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {

				System.out.println(arr[i]);
			}

		}

		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {

				System.out.println(arr[i]);
			}

		}
	}
}
