package com.test.project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringClass {
	
	private static String str = "Java";
	private static String str1 = "Java";
	private static String str2 = new String("Java");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer strBuf = new StringBuffer(str);
		
		System.out.println(str);
		System.out.println(strBuf);
		System.out.println(str1 == str);
		
		List<String> list = Arrays.asList("TEST", "TEST1", "TEST", "TEST2");

		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		
		
	}

}
