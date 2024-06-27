package com.test.project;

import java.util.function.Consumer;

class Inheritance1 {
	void show() {
		System.out.println("class Inheritance1");
	}
}

class Interitance2 {
	void show() {
		System.out.println("class Interitance2");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		Inheritance1 inheritance1 = new Inheritance1();
		inheritance1.show();
	}

}
