package com.oopconcepts;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("$yourname");

		for (String newList : arrayList) {
			System.out.println(newList);
		}
	}

}
