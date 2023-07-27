package com.OopConcepts;

public class AbstractionMain extends Secondary {
	public static void main(String[] args) {

	}

	@Override
	void abstractMethod() {
		System.out.println("this is abstracy method");

	}

}

abstract class Secondary {
	abstract void abstractMethod();

	void normalMethod() {
		System.out.println("this is normal method");
	}
}
