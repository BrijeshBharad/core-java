package com.OopConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<Integer> oldList = new ArrayList<>(Arrays.asList(1, 5, 9, 6, 6, 5, 4, 1, 2));
		System.out.println("list with duplicate elements" + oldList);

		Set<Integer> convert = new HashSet<>();
		convert.addAll(oldList);
		System.out.println(convert);
	}

}
