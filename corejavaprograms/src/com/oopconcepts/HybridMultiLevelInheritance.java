package com.oopconcepts;

//Joined to HybridInheritance
public class HybridMultiLevelInheritance extends Parent {

}

class Parent extends Grand {
	static void fourth() {
		System.out.println("This is fourth method");
	}
}

class Grand {
	static void first() {
		System.out.println("This is first method");
	}

	static void second() {
		System.out.println("This is second method");
	}

	static void third() {
		System.out.println("This is third method");
	}
}
