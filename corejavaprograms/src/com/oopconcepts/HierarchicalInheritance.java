package com.oopconcepts;

public class HierarchicalInheritance extends Employee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.toShow();
	}

}

class Employee {

	// Employee class is base class for HierarchicalInheritance and HierarchicalTest
	void toShow() {
		System.out.println("This is the method we need in both class");
	}

}