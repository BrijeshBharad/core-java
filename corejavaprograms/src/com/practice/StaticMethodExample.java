package com.practice;

//to access non-static method we have to make object
public class StaticMethodExample {

	public static void main(String[] args) {
		SecondTest.secondMethod();
		SecondTest secondTest = new SecondTest();
		secondTest.firstMethod();
	}

}

class SecondTest {

	void firstMethod() {
		System.out.println("This is text inside the non-static method ");
	}

	static void secondMethod() {
		System.out.println("We can access this  static method without creating an object");
	}

}
