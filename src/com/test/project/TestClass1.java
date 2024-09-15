package com.test.project;

import java.util.ArrayList;
import java.util.List;

public class TestClass1 {

	public static void main(String[] args) {
		// 5 -> 1 2 3 4 5 
		// 1 3 5 = 9
		// 2 4 = 2
		// 11
		
		//System.out.println(doSomething(5));
		
		System.out.println("do some: " + doSome(3));

	}
	public static int doSome(int n) {
		
		int result = 0;
		List<Integer> list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			list.add(i+1);
		}
		
		System.out.println("The list is: " + list);
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<n; j++) {
				if (i==0) {
					result = result + list.get(j);
					//System.out.println(result);
					j++;
				} else if(j != (n-1)) {
					result = result + list.get(j+1);
					//System.out.println(result);
					j+=3;
				}
				
			}
			
		}
		//System.out.println(result);
		return result;
	}
	public static int doSomething(int n) {
		int result = 0;
		int m = 0;
		int[] subArr = new int[m];
		int[] intArr = new int[n];
		
		for (int i=0; i<n; i++) {
			intArr[i] = i+1;
		}
		
		if (n == 1) {
			return result;
		} else {
			for (int j=0; j<n; j++) {
				result = result + intArr[j];
				subArr[j] = intArr[j+1];
				j++;
			}
		}
		return result;
	}

}
