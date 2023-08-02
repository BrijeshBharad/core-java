package com.practice;

import java.util.Scanner;

public class DefineAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		if (age < 12) {
			System.out.println("It is a child");
		}
		if (12 < age && age < 18) {
			System.out.println("It is a teenager");
		}
		if (18 <= age && age < 58) {
			System.out.println("It is a man");
		}
		if (age > 58) {
			System.out.println("It is a old man");
		}
	}

}