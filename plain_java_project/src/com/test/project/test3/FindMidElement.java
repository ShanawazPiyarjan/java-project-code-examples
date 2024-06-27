package com.test.project.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindMidElement {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 1, 5, 7, 8);
		
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(list1);
		
		
		
		
		
		

	}

}
