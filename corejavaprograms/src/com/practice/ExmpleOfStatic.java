package com.practice;

public class ExmpleOfStatic {

	public static void main(String[] args) {
		SecondClass itsObj = new SecondClass();
		itsObj.phoneName = "10R";
		itsObj.phoneCost = 45000;
		SecondClass.brand = "One Plus";
		itsObj.toShow();
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
