package com.OopConcepts;

public class InterfaceExample implements Complex {

	@Override
	public void runMethod() {
		System.out.println("this was unimplemanted method and i wrote it in normal class");
	}

}

interface Complex {
	abstract void runMethod();
}