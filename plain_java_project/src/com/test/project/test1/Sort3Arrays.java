package com.test.project.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort3Arrays {

	public static void main(String[] args) {
		
        Integer[] a={33,55,23,43,12};
        Integer[] b= {4,2,5,3};
        Integer[] c={62,4,6};
//merge into one single sorted array
        
        List<Integer> list1 = Arrays.asList(a);
        List<Integer> list2 = Arrays.asList(b);
        List<Integer> list3 = Arrays.asList(c);
        
        List<Integer> list4 = new ArrayList<>();
        list4.addAll(list1);
        list4.addAll(list2);
        list4.addAll(list3);
        
        Collections.sort(list4);
        
        System.out.println(list4);
        
        

	}

}
