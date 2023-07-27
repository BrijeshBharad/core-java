package com.OopConcepts;

public class HierarchicalInheritance extends employee {
	public static void main(String[] args) {
		employee empObj = new employee();
		empObj.toShow();
	}
}

class employee {
	void toShow() {
		System.out.println("this is the method we need in both class");
	}
}