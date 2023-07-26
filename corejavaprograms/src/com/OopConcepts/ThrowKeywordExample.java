package com.OopConcepts;

public class ThrowKeywordExample {

	public static void main(String[] args) {
		int age = 12;
		if (age < 18) {
			throw new ArithmeticException("age is not valide");
		}

	}
}