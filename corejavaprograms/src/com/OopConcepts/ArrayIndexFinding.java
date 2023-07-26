package com.OopConcepts;

public class ArrayIndexFinding {

	public static void main(String[] args) {
		int[] firstArray = { 25, 11, 22, 33, 65, 96, 44, 56, 66 };

		System.out.println("index number of 33 is " + findIndex(firstArray, 33));
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
