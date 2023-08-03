package com.practice;

public class ThisSuperKeywords {

	public static void main(String[] args) {
		TestOne testOne = new TestOne();
		testOne.toShow();
	}

}

class TestOne extends SuperOne {

	String colour = "White";
	
	void toShow() {
		System.out.println(colour);
		System.out.println(super.colour);
	}

}

class SuperOne {

	String colour = "Black";

}
