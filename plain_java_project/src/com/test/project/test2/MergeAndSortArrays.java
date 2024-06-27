package com.test.project.test2;

import java.util.Arrays;

public class MergeAndSortArrays {

	public static void main(String[] args) {
		int[] a = {33, 55, 23, 43, 12};
		int[] b = {4, 2, 5, 3};
		int[] c = {62, 4, 6};
		
		int[] mergedArray = mergeAndSortArrays(a, b, c);
		
		System.out.println("The mergedArrays is: " + Arrays.toString(mergedArray));
		
		int[] firstArray = {1, 2, 2, 1};
		int[] secondArray = {2, 2};
		
		Arrays.stream(firstArray).filter(x-> Arrays.stream(secondArray).anyMatch(y-> y==x)).sorted().distinct().forEach(System.out::println);

	}
	
	public static int[] mergeAndSortArrays(int[]... arrays) {
		return Arrays.stream(arrays).flatMapToInt(Arrays::stream).sorted().toArray();
	}

}
