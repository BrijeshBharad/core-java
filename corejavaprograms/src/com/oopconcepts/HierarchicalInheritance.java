package com.oopconcepts;

public class HierarchicalInheritance extends employee {
	public static void main(String[] args) {
		employee employeeObject = new employee();
		employeeObject.toShow();
	}
}

class employee {
	void toShow() {
		System.out.println("this is the method we need in both class");
	}
}