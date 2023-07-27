package com.oopconcepts;

//i override in this example which is known as runtime polymorphism
public class RunTimePolymorphism extends TestRunTime {

	void toRide() {
		System.out.println("then i wrote this");
	}

	public static void main(String[] args) {
		RunTimePolymorphism runTimeObj = new RunTimePolymorphism();
		runTimeObj.toRide();
	}

}

class TestRunTime {

	void toRide() {
		System.out.println("first i wrote this");
	}

}