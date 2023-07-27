package com.oopconcepts;

public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		ThrowsExample exceptionObject = new ThrowsExample();
		exceptionObject.method();
	}

	void method() throws Exception {
		throw new ArithmeticException("this is not good");
	}

}
