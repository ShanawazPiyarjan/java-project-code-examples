package com.test.project.test1;

import java.util.*;
import java.util.stream.Collectors;
public class CompareTwoArrays {

	public static void main(String[] args) {
		int arr1[] = {2, 4, 6, 8};
		int arr2[] = {1, 3, 5, 7};
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		
		for (int i=0; i< arr2.length; i++) {
			set.add(arr2[i]);
		}
		
		for (Integer i : set) {
			System.out.println(i);
		}
		
		List<Integer> list = new ArrayList<>(set);
		
		Collections.reverse(list);
		
		System.out.println(list.stream().limit(3).collect(Collectors.toList()));

	}

}
