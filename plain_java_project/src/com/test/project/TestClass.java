/**
 * 
 */
package com.test.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ShanawazPiyarjan
 *
 */
public class TestClass {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//		
//		List<Integer> list1 = Arrays.asList(1, 2, 6, 7, 8, 9);
//		
//		List<Integer> mergedList = Stream.concat(list.stream(), list1.stream()).sorted().distinct().collect(Collectors.toList());
//		
//		System.out.println(mergedList);
		List<String> list = Arrays.asList("abc","abcd","abcde","abc","abc","abcd"); 

		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
	}
		
}
