package com.oopconcepts;

public class InterfaceExample implements Complex {

	public static void main(String[] args) {
		InterfaceExample interfaceExample = new InterfaceExample();
		interfaceExample.runMethod();
	}

	@Override
	public void runMethod() {
		System.out.println("This was unimplemanted method and i wrote it in normal class");
	}

}

interface Complex {
	
	abstract void runMethod();
	
}