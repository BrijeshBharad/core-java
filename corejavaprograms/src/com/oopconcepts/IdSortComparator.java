package com.oopconcepts;

import java.util.Comparator;

public class IdSortComparator implements Comparator<StudentSecond> {

	@Override
	public int compare(StudentSecond o1, StudentSecond o2) {

		return o1.getid() - o2.getid();
	}

}
