package com.practice;

public class ThisSuperVariable {
	public static void main(String[] args) {
		TestOne newObj = new TestOne();
		newObj.toShow();
	}
}

class TestOne extends SuperOne {
	String colour = "white";

	void toShow() {
		System.out.println(colour);
		System.out.println(super.colour);
	}

}

class SuperOne {

	String colour = "black";
}
