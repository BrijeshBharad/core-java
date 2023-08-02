package com.practice;

public class StringImportantMethods {

	public static void main(String[] args) {
		charAtShow();
		compareStrings();
		letsConcat();
	}

	static void charAtShow() {
		String numberAtIndex = "Harharmahadev";
		System.out.println((numberAtIndex.charAt(4)));
		// with this we can know the character on any position
	}

	static void compareStrings() {
		String firstString = "Ramesh";
		String secondString = "Ramesh";
		System.out.println(firstString.compareTo(secondString));
		// by this we can compare two Strings
	}

	static void letsConcat() {
		String employeeFirstName = "Brijesh";
		String employeeSecondName = "Bharad";
		System.out.println(employeeFirstName.concat(employeeSecondName));
		// with this we can join two strings
	}
	
}
