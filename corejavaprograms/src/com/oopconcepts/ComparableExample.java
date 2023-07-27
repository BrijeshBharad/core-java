package com.oopconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(23, "brijesh", "birla"));
		list.add(new Student(8, "rakesh", "silveroak"));
		list.add(new Student(17, "anjali", "nirma"));
		list.add(new Student(53, "narmada", "gujrat"));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

class Student implements Comparable<Student> {

	private int age;
	private String name;
	private String college;

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", college=" + college + "]";
	}

	public Student(int age, String name, String college) {
		super();
		this.age = age;
		this.name = name;
		this.college = college;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
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

	@Override
	public int compareTo(Student o) {

		return this.age - o.age;
	}

}
