package com.OopConcepts;

public class ThrowsExample {

	public static void main(String[] args) throws Exception {
ThrowsExample Obj=new ThrowsExample();
Obj.method();
	}
	void method() throws Exception{
		throw new ArithmeticException("this is not good");
	}

}
