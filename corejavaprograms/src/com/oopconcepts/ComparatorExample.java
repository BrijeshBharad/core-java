package com.oopconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<StudentSecond> listSecond = new ArrayList<>();

		listSecond.add(new StudentSecond(23, "brijesh", "birla"));
		listSecond.add(new StudentSecond(8, "rakesh", "silveroak"));
		listSecond.add(new StudentSecond(17, "anjali", "nirma"));
		listSecond.add(new StudentSecond(53, "narmada", "gujrat"));

		System.out.println(listSecond);
		Collections.sort(listSecond, new idSort_Comparator());
		System.out.println(listSecond);
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
