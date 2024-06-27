package com.test.project.test1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {
	public static void main(String[] args) {

		String str = "This is String";
		
		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	}

}
