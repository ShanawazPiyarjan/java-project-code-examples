package com.test.project.test2;

public class PrintNumbers1to100WithOutLoop {

	public static void main(String[] args) {
		int i = 1;
		int j = 100;

		printNumber1to100(i,j);

}
	public static void printNumber1to100(int i, int j) {
		if (i<=j) {
			System.out.println(i);
			i++;
			printNumber1to100(i, j);
		}
	}

}
