package com.oopconcepts;

public class HybridMultiLevelInheritance extends Parent {

}

class Parent extends Grand {
	static void fourth() {
		System.out.println("this is fourth method");
	}
}

class Grand {
	static void first() {
		System.out.println("this is first method");
	}

	static void second() {
		System.out.println("this is second method");
	}

	static void third() {
		System.out.println("this is third method");
	}
}
