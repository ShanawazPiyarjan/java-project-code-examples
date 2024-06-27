package com.test.project.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintFirstNonRepeatingChar {

	public static void main(String[] args) {
		
		String str = "abcdcaf";
		
		String[] str1 = str.split("");
		
		List<String> set = new ArrayList<>();
		
		List<String> du = Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(f -> f.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(du);
		
		for (int i=0; i<str1.length; i++) {
			
			
			if (set.contains(str1[i])) {
				System.out.println(str1[i]);
				
			}
			set.add(str1[i]);
			
		}
		
		Set<String> set1 = new HashSet<>(set);
		
		//System.out.println(set1);
		
		System.out.println(set);
		//for (int i=0; i<str1.length; i++) {
	
		
		List<Entry<String, Long>> list = Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(f -> f.getValue() == 1).limit(1).collect(Collectors.toList());
		
		//System.out.println(list);

	}

}
