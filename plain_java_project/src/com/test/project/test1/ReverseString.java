package com.test.project.test1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "India is my country";
		
//		StringBuilder sb = new StringBuilder(str);
//		
//		
//		System.out.println("Reverse String: " + sb.reverse());
		
		String str1[] = str.split(" ");
		
		List<String> list = Arrays.stream(str1).map(w -> new StringBuilder(w).reverse().toString()).collect(Collectors.toList());
		
		System.out.println(list);
		
		
		

	}
}
