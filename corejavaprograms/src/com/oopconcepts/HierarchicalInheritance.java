package com.oopconcepts;

public class HierarchicalInheritance extends Employee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.toShow();
	}

}

class Employee {

	void toShow() {
		System.out.println("this is the method we need in both class");
	}

}