package com.practice;

import java.util.Scanner;

public class WhileLoop {

	/*
	 * this is a program to find the number is pelidrome or not
	 */
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int sum = 0;
		int temporary = number;

		while (number > 0) {
			int reminder = number % 10;
			sum = (sum * 10) + reminder;
			number = number / 10;
		}

		if (sum == temporary) {
			System.out.println("given number is pelidrome number");
		} else {
			System.out.println("this number is not a pelidrome  number");
		}
	}

}
