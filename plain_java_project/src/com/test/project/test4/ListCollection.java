package com.test.project.test4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListCollection {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person(1, "Shanawaz", 10),
				new Person(2, "Rahul", 10),
				new Person(3, "Siva", 10),
				new Person(1, "Shanawaz", 10),
				new Person(2, "Rahul", 10),
				new Person(3, "Siva", 10),
				new Person(1, "Shanawaz", 10),
				new Person(2, "Rahul", 10),
				new Person(3, "Siva", 10),
				new Person(1, "Shanawaz", 10),
				new Person(2, "Rahul", 10),
				new Person(3, "Siva", 10),
				new Person(1, "Shanawaz", 10),
				new Person(2, "Rahul", 10),
				new Person(3, "Siva", 10)
				);

		List<Person> persons = list.stream().filter(p -> p.getAge() <= 18).limit(10).collect(Collectors.toList());
		
		System.out.println(persons);
	}

}

class Person {
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}