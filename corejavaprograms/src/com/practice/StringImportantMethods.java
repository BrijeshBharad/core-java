package com.practice;

public class StringImportantMethods {

	public static void main(String[] args) {
		charAtShow();
		compareStrings();
		letsConcat();
	}

	static void charAtShow() {
		String numberAtIndex = "Javaisgood";
		System.out.println((numberAtIndex.charAt(4)));
		// With this we can know the character on any position
	}

	static void compareStrings() {
		String firstString = "Python";
		String secondString = "Python";
		System.out.println(firstString.compareTo(secondString));
		// By this we can compare two Strings
	}

	static void letsConcat() {
		String employeeFirstName = "Brijesh";
		String employeeSecondName = "Bharad";
		System.out.println(employeeFirstName.concat(employeeSecondName));
		// With this we can join two strings
	}
	
}
