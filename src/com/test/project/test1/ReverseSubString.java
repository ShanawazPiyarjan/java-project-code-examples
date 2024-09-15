package com.test.project.test1;

public class ReverseSubString {

	public static void main(String[] args) {
		
		String str = "123456789";
		String str1 = str.substring(0, 3);
		String str2 = str.substring(3);
		
		System.out.println(str1);
		System.out.println(str2);
		
		StringBuffer sb = new StringBuffer(str2);
		String str3 = sb.reverse().toString();
		

		System.out.println(str1 + str3);
		

	}

}
