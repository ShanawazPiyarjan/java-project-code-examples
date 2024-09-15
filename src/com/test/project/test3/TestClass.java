package com.test.project.test3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;


public class TestClass {

	public static void main(String[] args) {
//		 List<Integer> list = Arrays.asList(10,5,20,15,25);
//	        
//	        list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
//	        
//	        Collections.sort(list, Collections.reverseOrder());
//	        
//	        System.out.println(list.get(1));
//	        
//	        List<Integer> list1 = Collections.unmodifiableList(Arrays.asList(1,2,3));
//	        
//	        list1.add(5);
		
//		Thread t = new Thread();
//		Thread t1 = new Thread();
//		t.start();
//		t1.start();
//		int end = 'd';
//		
//		System.out.println('j'+'a'+'v'+'a');
//		System.out.println(('a'+'a')/2);
//		System.out.println('v');
//		System.out.println('j');
//		System.out.println(('A'+'A')/2);
//		System.out.println(end);
		
//		  int number = 5;
//	        System.out.println("Before method call: " + number);
//	        modifyPrimitive(number);
//	        System.out.println("After method call: " + number);
//	    }
//
//	    public static void modifyPrimitive(int num) {
//	        num = 10; // This only modifies the local copy
//	    }
//		
//		Integer num1 = 100;
//		Integer num2 = 100;
//		Integer num3 = 127;
//		Integer num4 = 127;
//		
//		if (num1 == num2) {
//			System.out.println("num1 == num2");
//		} else {
//			System.out.println("num1 != num2");
//		}
//		
//		if (num3 == num4) {
//			System.out.println("num3 == num4");
//		} else {
//			System.out.println("num3 != num4");
//		}
		
//		System.out.println("before if condition");
//		
//		if (true) {
//			return;
//		}
//		System.out.println("after if condition");
		
//		String[] strArray = {"aa", "bb", "cc", "cc" }; // 4
//
//		Set<String> set = new HashSet<>();
//
//		for (int i =0; i< strArray.length; i++) {
//
//		if (!set.contains(strArray[i])) {
//		set.add(strArray[i]);
//		}
//
//		//System.out.println(strArray[i]);
//		
//		
//
//		}
//		System.out.println(set);
		
//		List<Integer> integers = Arrays.asList(3, 9, 7, 6, 10, 20, 0);
//		integers.forEach(i -> {
//			try {
//				System.out.println(50/i);
//			} catch (Exception e) {
//				System.err.println("Exception occured: " + e);
//				System.err.println("Exception occured: " + e.getStackTrace());
//				System.err.println("Exception occured: " + e.getLocalizedMessage());
//				System.err.println("Exception occured: " + e.getCause());
//				System.err.println("Exception occured: " + e.getClass());
//				System.err.println("Exception occured: " + e.getSuppressed());
//			}
//		});
		
//		int a = 10;
//		int b = 20;
//		
//		a = a+b; // 30
//		b = a-b; // 30 - 20 = 10
//		a = a-b; // 30 - 10 = 20
//		
//		System.out.println(a);
//		System.out.println(b);
		
//		String str = "Test";
//		str = "Passed";
//		
//		System.out.println(str);
		
//		List<Integer> list = new ArrayList<>();
//
//		list.add(10);
//		list.add(5);
//		list.add(12);
//		list.add(2);
//
//		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
//		
//		System.out.println(sortedList);
		
		int a = 5;
		int[] arr = {2,5,5,-1, 1};
		
		Set<Integer> set = new HashSet<>();
		
		for (int i=0; i< arr.length; i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set + " size is :" + set.size());
		
	}
}
