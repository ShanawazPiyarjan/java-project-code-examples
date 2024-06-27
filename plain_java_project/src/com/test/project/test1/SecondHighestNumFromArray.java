package com.test.project.test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumFromArray {

	public static void main(String[] args) throws ArithmeticException {
		
		List<Integer> list = Arrays.asList(3,2,1,5,6,8,4);
		
		List<Integer> secondHighestNum =  list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList());
		
		//Collections.reverse(secondHighestNum);
		
		System.out.println(secondHighestNum);
		
		int a = 5, b = 9;
		
		a = a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a is: "+ a);
		System.out.println("b is: "+ b);

	}

}
