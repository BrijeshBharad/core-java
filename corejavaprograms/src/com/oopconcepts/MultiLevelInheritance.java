package com.oopconcepts;

public class MultiLevelInheritance extends ParentClass {

	public static void main(String[] args) {
		firstMethod();
		seconfMethod();
		thirdMethod();
		fourthMethod();
	}

}

class ParentClass extends GrandClass {

	static void fourthMethod() {
		System.out.println("This is fourth method");
	}

}

class GrandClass {

	static void firstMethod() {
		System.out.println("This is first method");
	}

	static void seconfMethod() {
		System.out.println("This is second method");
	}

	static void thirdMethod() {
		System.out.println("This is third method");
	}

}
