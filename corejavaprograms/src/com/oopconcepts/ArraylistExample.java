package com.OopConcepts;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("$yourname");

		for (String newList : list) {
			System.out.println(newList);
		}
	}
}
