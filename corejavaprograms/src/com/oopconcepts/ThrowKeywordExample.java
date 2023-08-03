package com.oopconcepts;

public class ThrowKeywordExample {

	public static void main(String[] args) {
		int age = 12;
		if (age > 18) {
			System.out.println("You can access");
		} else {
			throw new ArithmeticException("Age is not valid");
		}
	}

}