package com.test.project.test1;

public class StringClass {

	public static void main(String[] args) {
		
		// By using build in function 
		// System.out.println(str.replaceAll("C", "");

		String str = "CloudTech";

		char[] charArray = str.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < charArray.length; i++) {

			String str1 = String.valueOf('c');
			String str2 = String.valueOf(charArray[i]);

			if (!str1.equalsIgnoreCase(str2)) {

				sb.append(str2);
			}

		}
		System.out.println(sb);

	}

}
