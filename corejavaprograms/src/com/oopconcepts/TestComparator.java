package com.OopConcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {

		// made a sorting on the bases of last digit of number
		// we use comparator to write our own logic while shorting
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// this is a logic to compare last digit and
				// return 1 means it swap two numbers that it compares
				// and -1 means it doesnt compare
				if (o1 % 10 > o2 % 10)
					return 1;
				else
					return -1;
			}
		};

		List<Integer> number = new ArrayList<>();
		number.add(45);
		number.add(99);
		number.add(72);
		number.add(39);
		Collections.sort(number, com);
		System.out.println(number);
	}
}
