package com.oopconcepts;

import java.util.ArrayList;

public class ArrayListExample {

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
