package com.practice;

import java.util.Scanner;

/*
 * This is a program to find the number is palindrome or not
 */
public class WhileLoop {

	public static void main(String[] args) {
		System.out.println("Enter a number");
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
			System.out.println("Given number is palindrome number");
		} else {
			System.out.println("This number is not a palindrome  number");
		}
		scanner.close();
	}

}
