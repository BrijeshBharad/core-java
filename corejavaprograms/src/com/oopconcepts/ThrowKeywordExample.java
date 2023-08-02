package com.oopconcepts;

public class ThrowKeywordExample {

	public static void main(String[] args) {
		int age = 12;
		if (age < 18) {
			throw new ArithmeticException("Age is not valide");
		}
	}

}