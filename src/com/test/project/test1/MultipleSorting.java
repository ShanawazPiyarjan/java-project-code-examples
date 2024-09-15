package com.test.project.test1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.String;

public class MultipleSorting {

	public String id;
	public String name;
	public String salary;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}

	

	public MultipleSorting() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MultipleSorting(String id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "MultipleSorting [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		
		List<MultipleSorting> list = Arrays.asList(
				new MultipleSorting("1","Test1","1000"),
				new MultipleSorting("2","West2","2000"),
				new MultipleSorting("3","Fest3","3000"),
				new MultipleSorting("4","Yest4","4000"),
				new MultipleSorting("5","Eest5","5000"),
				new MultipleSorting("6","Aest6","2000")
				
				);
				List<MultipleSorting> list1 = list.stream()
						.sorted(Comparator.comparing(MultipleSorting::getSalary)
								.thenComparing(Comparator.comparing(MultipleSorting::getName)).reversed())
						.limit(3).collect(Collectors.toList());

				System.out.println(list1);

	}

}
