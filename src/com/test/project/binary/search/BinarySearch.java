package com.test.project.binary.search;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;
		int k = 4;
		
		while(left >= right) {
		
		if (arr[mid] == k) {
			System.out.println("Value is present at: " + mid);
		} else if (k > arr[mid]) {
			left = mid + 1;
		} else {
			right = mid - 1;
		}
		}
		
		System.out.println("Ended");

	}

}
