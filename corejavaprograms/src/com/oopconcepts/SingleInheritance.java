package com.oopconcepts;

public class SingleInheritance extends SecondaryClass {

	public static void main(String[] args) {
		parentMethod();
	}

}

class SecondaryClass {

	static void parentMethod() {
		System.out.println("This is a parent method");
	}

}
