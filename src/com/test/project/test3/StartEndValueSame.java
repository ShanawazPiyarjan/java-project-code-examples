package com.test.project.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartEndValueSame {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abc", "mnm", "xlx", "xyz", "fkf", "qwe");
		
		List<String> moList = list.stream().filter(f ->f.endsWith(String.valueOf(f.charAt(0)))).collect(Collectors.toList());
		
		System.out.println(list);
		
		System.out.println(moList);
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
		
		List<Integer> list3 = new ArrayList<>();
		
		for (int i=0; i<list1.size(); i++) {
			list3.add(list1.get(i));
		}
		
		for (int i=0; i<list2.size(); i++) {
			list3.add(list2.get(i));
		}
		
		System.out.println("Using for loop: " + list3);
		
		List<Integer> list4 = new ArrayList<>();
		
		list4.addAll(list1);
		list4.addAll(list2);
		
		System.out.println("Using addALL method: " + list4);
		
		List<Integer> list5 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		
		System.out.println("Using stream: " + list5);
		
		Set<Integer> set = new HashSet<>(list5);
		
		System.out.println("Unique values: " + set);

	}

}
