package com.oopconcepts;

public class singleInheritance extends SecondaryClass {

	public static void main(String[] args) {
		parentMethod();
	}

}

class SecondaryClass {

	static void parentMethod() {
		System.out.println("this is a parent method");
	}

}
