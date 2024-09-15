package com.test.project;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.HashSet;

public class CollectionsFramework {

	public static void main(String[] args) {

//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//		int sum = list.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
//		
//		
//
//		System.out.println("The sum is: " + sum);
//		
//		System.out.println(list.stream().count());
		
		List<String> fruits = Arrays.asList("Apple","Banana","Pine Apple", "Watermelon", "Apple");
		
//		Optional<String> lastFruit = fruits.stream().skip(fruits.size() - 1).findFirst();
//		
		System.out.println("fruits: " + fruits);
		
		Set<String> uniqueFruits = new HashSet<>(fruits);
		
		System.out.println("uniqueFruits: " + uniqueFruits);
		
		System.out.println(fruits.stream().distinct().collect(Collectors.toList()));
		
		Parent p = new Parent();
		p.show();
		

	}
	
}

final class Parent {
	void show() {
		System.out.println("test");
	}
}