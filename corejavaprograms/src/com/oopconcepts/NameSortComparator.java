package com.oopconcepts;

import java.util.Comparator;

//joined with ComparatorExample
public class NameSortComparator implements Comparator<StudentSecond> {

	@Override
	public int compare(StudentSecond o1, StudentSecond o2) {

		return o1.getName().compareTo(o2.getName());
	}

}
