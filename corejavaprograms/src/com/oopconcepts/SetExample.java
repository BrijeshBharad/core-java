package com.oopconcepts;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<>();
		setString.add("Vivek");
		setString.add("Brijesh");
		setString.add("Janki");
		setString.add("Bhargav");
		setString.add("Vivek");
		System.out.println(setString);
		// it does not take duplicate values
	}

}
