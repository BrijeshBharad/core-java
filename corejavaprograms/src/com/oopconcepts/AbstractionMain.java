package com.oopconcepts;

public class AbstractionMain extends Secondary {

	public static void main(String[] args) {
		AbstractionMain abstractionmain = new AbstractionMain();
		abstractionmain.normalMethod();
		abstractionmain.abstractMethod();
	}

	@Override
	void abstractMethod() {
		System.out.println("this is abstract method");
	}

}

abstract class Secondary {

	abstract void abstractMethod();

	void normalMethod() {
		System.out.println("this is normal method");
	}

}
