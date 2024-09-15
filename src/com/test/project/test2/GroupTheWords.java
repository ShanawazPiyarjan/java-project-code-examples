package com.test.project.test2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupTheWords {

	public static void main(String[] args) {
		
		Test test = new Test();
		test.show();
		
		String str = "i have a sentence with technical words";
		
		List<Character> ch = Arrays.asList('a', 'e', 'i', 'o', 'u');
		String[] vowels = {"a", "e", "i", "o", "u"};
		
		
		// 1=[i, a]
		// 4=[have, with]
		// 5=[words]
		// 8=[sentence]
		// 9=[technical]
		
		String[] strArray = str.split("");
//		char[] charArray = str.toCharArray();
//		
//		Map<Integer, List<String>> map = Arrays.stream(strArray).collect(Collectors.groupingBy(String::length));
//	//	.entrySet().map(Map.Entry::getValue);
//		
//		System.out.println(map);
//
//		//
//		for (int i=0; i<str.length(); i++) {
//			if (ch.contains(str.charAt(i))) {
//				System.out.println(str.charAt(i));
//			}
//				
//		}
		
		//
	Arrays.stream(strArray).filter(x-> Arrays.stream(vowels).anyMatch(y-> y.equals(x))).distinct().forEach(System.out::println);
		
		
	}

}

class Test {
	public static String str = "new";
	
	void show() {
		System.out.println(str);
	}
}
