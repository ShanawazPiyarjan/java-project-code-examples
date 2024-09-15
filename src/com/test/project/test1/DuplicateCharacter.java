package com.test.project.test1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "helloworld";
		
		List<String> list = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(list);
		
		
		List<Integer> list1 = Arrays.asList(3,4,5,6,7,8,8);
		
		Set<Integer> set = new HashSet<>(list1);
		
		System.out.println(set);

	}

}
