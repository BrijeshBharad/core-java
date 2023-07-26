package com.OopConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		Comparator<Student> com = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.age > o2.age)
					return 1;
				else
					return -1;
			}
		};
		List<Student> list = new ArrayList<>();
		list.add(new Student(25, "rakesh"));
		list.add(new Student(47, "romit"));

		list.add(new Student(66, "hitesh"));

		list.add(new Student(23, "bulbul"));
		list.add(new Student(25, "rakesh"));
		Collections.sort(list);
		// System.out.println(list);
		for (Student s : list) {
			System.out.println(s);
		}

	}

}

class Student implements Comparable<Student> {
	int age;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	public int compareTo(Student that) {
		if (this.age > that.age)
			return 1;
		else
			return -1;
	}
}
