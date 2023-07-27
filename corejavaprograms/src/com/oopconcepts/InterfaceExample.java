package com.oopconcepts;

public class InterfaceExample implements Complex {

	public static void main(String[] args) {
		InterfaceExample interfaceExampleObject = new InterfaceExample();
		interfaceExampleObject.runMethod();
	}

	@Override
	public void runMethod() {
		System.out.println("this was unimplemanted method and i wrote it in normal class");
	}

}

interface Complex {
	abstract void runMethod();
}