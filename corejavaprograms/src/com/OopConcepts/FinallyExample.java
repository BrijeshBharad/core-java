package com.OopConcepts;

public class FinallyExample {
	public static void main(String[] args) {
		int varOne = 50;
		int varTwo = 10;
		int result;
		try {
			System.out.println(result = varOne / varTwo);
		} finally {
			System.out.println(varOne * varTwo);
		}
	}
}
