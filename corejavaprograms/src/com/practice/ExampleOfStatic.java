package com.practice;

//With this program we can see the use of static 
//We can access variable which have static keyword without creating object of that class
public class ExampleOfStatic {

	public static void main(String[] args) {
		SecondClass secondClass = new SecondClass();
		secondClass.phoneName = "10R";
		secondClass.phoneCost = 45000;
		// Here we directly access variable with the class name.
		SecondClass.brand = "OnePlus";
		secondClass.toShow();
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
