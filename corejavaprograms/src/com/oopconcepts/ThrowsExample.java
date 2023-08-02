package com.oopconcepts;

public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		ThrowsExample throwExample = new ThrowsExample();
		throwExample.method();
	}

	void method() throws Exception {
		throw new ArithmeticException("This is not good");
	}

}
