package com.oopconcepts;

import java.util.Comparator;

//Joined with ComparatorExample
public class NameSortComparator implements Comparator<StudentSecond> {

	@Override
	public int compare(StudentSecond studentSecons, StudentSecond studentSecons2) {

		return studentSecons.getName().compareTo(studentSecons2.getName());
	}

}
