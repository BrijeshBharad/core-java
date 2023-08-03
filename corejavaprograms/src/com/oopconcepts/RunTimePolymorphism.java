package com.oopconcepts;

//I override in this example which is known as runtime polymorphism
public class RunTimePolymorphism extends TestRunTime {

	void toRide() {
		System.out.println("Then I wrote this");
	}

	public static void main(String[] args) {
		RunTimePolymorphism runTimePolymorphism = new RunTimePolymorphism();
		runTimePolymorphism.toRide();
	}

}

class TestRunTime {

	void toRide() {
		System.out.println("First I wrote this");
	}

}