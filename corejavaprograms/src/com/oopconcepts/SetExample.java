package com.oopconcepts;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<String>();
		setString.add("vivek");
		setString.add("brijesh");
		setString.add("janki");
		setString.add("bhargav");
		setString.add("vivek");
		System.out.println(setString);
		// it does not take duplicate values
	}

}
