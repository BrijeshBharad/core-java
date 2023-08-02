
package com.practice;

public class DifferanceOfEqualsAndOperator {

	public static void main(String[] args) {
		stringCompare();
		numberCompare();
	}

	static void stringCompare() {
		String firstString = "Hello";
		String secondString = "Hello";
		String thirdString = new String("Hello");

		System.out.println(firstString == secondString);

		System.out.println(firstString.equals(secondString));
		// but
		// == use to compare the pointed values
		// equals to only compares values

		System.out.println(firstString == thirdString);
		System.out.println(firstString.equals(thirdString));
	}

	static void numberCompare() {
		int firstNumber = 45;
		int secondNumber = 45;
		System.out.println(firstNumber == secondNumber);
		// equalsTo method only works for String
	}

}
