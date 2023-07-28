package com.practice;

public class ExampleOfStatic {

	public static void main(String[] args) {
		SecondClass secondObj = new SecondClass();
		secondObj.phoneName = "10R";
		secondObj.phoneCost = 45000;
		SecondClass.brand = "One Plus";
		secondObj.toShow();
	}

}
class SecondClass {
	
	String phoneName;
	int phoneCost;
	static String brand;

	void toShow() {
		System.out.println(phoneName + " " + phoneCost + " " + brand);
	}
	
}
