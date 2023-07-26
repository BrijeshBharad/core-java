package com.OopConcepts;

//i override in this example which is known as runtime polymorphism
public class RunTimePolymorphism extends TestRunTime {
	void toRide() {
		System.out.println("then i wrote this");
	}

	public static void main(String[] args) {
		RunTimePolymorphism Obj = new RunTimePolymorphism();
		Obj.toRide();
	}
}

class TestRunTime {
	void toRide() {
		System.out.println("first i wrote this");
	}
}