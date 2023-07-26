package com.practice;

public class StringImportantMethods {

	public static void main(String[] args) {
		charAtShow();
		compareStrings();
		letsConcat();
	}

	static void charAtShow() {
		String numberAtIndex = "harharmahadev";
		System.out.println((numberAtIndex.charAt(4)));
	}

	static void compareStrings() {
		String firstString = "ramesh";
		String secondString = "ramesh";
		System.out.println(firstString.compareTo(secondString));
	}

	static void letsConcat() {
		String employeeFirstName = "brijesh";
		String employeeSecondName = "bharad";
		System.out.println(employeeFirstName.concat(employeeSecondName));
	}
}
