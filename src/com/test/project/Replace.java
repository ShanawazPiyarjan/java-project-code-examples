package com.test.project;

public class Replace {

	public static void main(String[] args) {
		String num = "1234567890";
		
		String replacedString = num.replaceAll(".(?=.{2})", "#");
		
		System.out.println(replacedString);

	}

}
