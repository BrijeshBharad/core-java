package com.practice;

public class staticMethodExample {

	public static void main(String[] args) {
SecondTest.secondMethod();
// to access non-static method we have to make object

SecondTest Obj=new SecondTest();
Obj.firstMethod();

	}

}
class SecondTest{
	void firstMethod() {
		System.out.println("this is text inside the non-static method ");
	}
	static void secondMethod() {
		System.out.println("we can access this  static method without creating an object");
	}
}
