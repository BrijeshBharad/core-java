package com.oopconcepts;

import java.util.Scanner;

public class ArrayIndexFinding {

	public static void main(String[] args) {
		int[] firstArray = { 25, 11, 22, 33, 65, 96, 44, 56, 66 };
		System.out.println("Enter the number of which you want to know index");
		Scanner scanner = new Scanner(System.in);
		int compareNumber = scanner.nextInt();
		System.out.println(findIndex(firstArray, compareNumber));
		scanner.close();
	}

	public static int findIndex(int[] firstArray, int number) {
		int lengthOfArray = firstArray.length;
		int initial = 0;
		while (initial < lengthOfArray) {
			if (firstArray[initial] == number) {
				return initial;
			} else {
				initial++;
			}
		}
		return 0;
	}

}
