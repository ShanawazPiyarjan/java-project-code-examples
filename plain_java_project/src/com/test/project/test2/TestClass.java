package com.test.project.test2;

import java.util.*;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		
		// print numbers from 1 to 100 without using numbers
	
//		int a = 'a'/'a';
//		
//		int b = "**********".length();
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		for (int i=a; i<=b*b; i++) {
//			if (i%2 != 0) {
//				System.out.println(i);
//			}
//			
//		}
		

		// numbers start with 1
		// input 10, 13, 17, 56, 95, 11
		
		List<Integer> list = Arrays.asList(10, 13, 17, 56, 95, 11);
		
		List<String> list2 = list.stream().map(s-> s+"").filter(f->f.startsWith("1")).collect(Collectors.toList());
		
		System.out.println("The list start with 1: " + list2);
		
		List<String> list1 = Arrays.asList("Hello", "World", "Hi", "Welcome");
		
		List<String> modifiedList = list1.stream().filter(f-> f.startsWith("W")).collect(Collectors.toList());
		
		System.out.println("The list start with W: " + modifiedList);
		
		
		// int[] firstArray = {1,2,3,3,1}
		// int[] secondArray = {3,3}
		int[] firstArray = {2,3,3,1};
		int[] secondArray = {3,3,1};
		Set<Integer> set = new HashSet<>();
		
		for (int i=0; i<firstArray.length; i++) {
			for (int j=0; j<secondArray.length; j++) {
				if (firstArray[i] == secondArray[j]) {
					set.add(firstArray[i]);
				}
			}
		}
		
		System.out.println("The set is: " + set);
		
Arrays.stream(firstArray).filter(x->Arrays.stream(secondArray).anyMatch(y->y!=x)).distinct().sorted()
		.forEach(System.out::println);





 	}

}
