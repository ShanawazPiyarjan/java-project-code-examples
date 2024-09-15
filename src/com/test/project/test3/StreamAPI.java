package com.test.project.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, 500));
		list.add(new Employee(2, 1000));
		list.add(new Employee(3, 1500));
		list.add(new Employee(4, 2000));
		list.add(new Employee(5, 2500));
		list.add(new Employee(6, 3000));
		list.add(new Employee(7, 3500));
//		
//		for (Employee emp : list) {
//		System.out.println(emp);
//		}
//		
		// sort the employees based on the salary in desc order
		
		List<Employee> list1 = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		
		System.out.println(list1);
		
		// top 3 salaried employees
		
		List<Employee> top3= list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());

		System.out.println(top3);
		
		// less than 3rd highest salary
		
		List<Employee> threerd = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(3).collect(Collectors.toList());
		
		System.out.println(threerd);
		

		int[] input = {2,3,4,5,7};
		
		 int sum = Arrays.stream(input).sum();
		 
		 System.out.println(sum);
	}


}


class Employee {
	int id;
	int salary;
	
	Employee(int id, int salary) {
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}