package com.test.project.test4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11, 21, 31);
		
		//long map = list.stream().filter(f -> f.startsWith(3)).count();
		
		//System.out.println(map);
		
		int x = 10;
		int y = 20;
		
		System.out.println(x++ + ++y);

	}

}
