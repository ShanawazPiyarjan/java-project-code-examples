package com.test.project.test3;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		
		List<String> arrayList = new CopyOnWriteArrayList<>();
		Date date = new Date(); 
		
		
		arrayList.add("Test1");
		arrayList.add("Test2");
		arrayList.add("Test3");
		arrayList.add("Test4");
		arrayList.add("Test5");
		
		System.out.println(arrayList.stream().findAny().get());
		
		System.out.println("Date is: " + date);
		System.out.println(arrayList.get(4));
		System.out.println("Date is: " + date);
		
		Iterator<String> itr = arrayList.iterator();
		arrayList.add("Test6");
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("User1");
		linkedList.add("User2");
		linkedList.add("User3");
		linkedList.add("User4");
		linkedList.add("User5");
		
		System.out.println("Date is: " + date);
		System.out.println(linkedList.get(4));
		System.out.println("Date is: " + date);
		
		
		Set<String> set = new HashSet<>();
		set.add("Emp1");
		set.add("Emp2");
		set.add("Emp3");
		set.add("Emp4");
		set.add("Emp5");

		Set<String> s =  set.stream().filter(f-> f.contains("Emp5")).collect(Collectors.toSet());
		
		System.out.println(s);
		
	}
}
