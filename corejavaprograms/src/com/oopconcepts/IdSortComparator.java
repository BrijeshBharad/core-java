package com.oopconcepts;

import java.util.Comparator;

//Joined with ComparatorExample
public class IdSortComparator implements Comparator<StudentSecond> {

	@Override
	public int compare(StudentSecond studentSecond, StudentSecond studentSecond2) {

		return studentSecond.getid() - studentSecond2.getid();
	}

}
