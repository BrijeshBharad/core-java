package com.oopconcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

// joined with IdSortComparator
//joined with NameSortComparator
public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<StudentSecond> arrayList = new ArrayList<>();

		arrayList.add(new StudentSecond(23, "brijesh", "birla"));
		arrayList.add(new StudentSecond(8, "rakesh", "silveroak"));
		arrayList.add(new StudentSecond(17, "anjali", "nirma"));
		arrayList.add(new StudentSecond(53, "narmada", "gujrat"));

		System.out.println(arrayList);
		// This will sort our list by id
		System.out.println("Sorting by id");
		Collections.sort(arrayList, new IdSortComparator());
		System.out.println(arrayList);
		// This will sort our list by name
		System.out.println("sorting by name");
		Collections.sort(arrayList, new NameSortComparator());
		System.out.println(arrayList);
	}

}

class StudentSecond {

	private int id;
	private String name;
	private String college;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}

	public StudentSecond(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
