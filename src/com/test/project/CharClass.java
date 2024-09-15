/**
 * 
 */
package com.test.project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ShanawazPiyarjan
 *
 */
public class CharClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = Arrays.asList("abc","1abc","xyz","2xyz","abca");
		
		// Character.isDigit(f.charAt(0))
		
		// f.endsWith(String.valueOf(f.charAt(0)))
		
		// f.startsWith("x")
		
		List<String> list1 = list.stream().filter(f -> f.startsWith("x")).collect(Collectors.toList());
		
		System.out.println(list1);
		

	}

}
