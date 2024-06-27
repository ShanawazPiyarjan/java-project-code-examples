package com.test.project;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollecttionsFramework2 {

	public static void main(String[] args) {

		String str = "ilovejavaprogramming";
		String str1 = "I am a programmer";

		String[] string = str.split("");

		// 1. No. of char count on the string
		Map<String, Long> map = Arrays.stream(string)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("No. of char count: " + map);

		// 2. Duplicate Elements
		List<String> duplicateElements = Arrays.stream(string)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println("Duplicate Elements: " + duplicateElements);

		// 3. Unique Elements
		List<String> uniqueElements = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(s -> s.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println("Unique Elements: " + uniqueElements);
		
		Map<String, Long> map1 = Arrays.stream(str1.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("Str1 map1: " + map1);

	}

}
