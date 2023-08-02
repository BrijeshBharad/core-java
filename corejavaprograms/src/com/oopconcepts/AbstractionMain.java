package com.oopconcepts;

public class AbstractionMain extends Secondary {

	public static void main(String[] args) {
		AbstractionMain abstractionMain = new AbstractionMain();
		abstractionMain.normalMethod();
		abstractionMain.abstractMethod();
	}

	@Override
	void abstractMethod() {
		System.out.println("This is abstract method");
	}

}

abstract class Secondary {
	
    //This is abstract method
	abstract void abstractMethod();

	void normalMethod() {
		System.out.println("This is normal method");
	}

}
