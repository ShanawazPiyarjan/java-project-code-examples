package com.test.project.test1;

public class StringClass1 {
	public static void main(String[] args) {
		String s = "Boy is good";
		
		String[] arr = s.split(" ");
		
		for(String st : arr) {
			System.out.print(st.charAt(0));
		}
	}
}
