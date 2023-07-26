package com.OopConcepts;

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
		System.out.println("this is fourth method");
	}

}

class GrandClass {
	static void firstMethod() {
		System.out.println("this is first method");
	}

	static void seconfMethod() {
		System.out.println("this is second method");
	}

	static void thirdMethod() {
		System.out.println("this is third method");
	}
}
