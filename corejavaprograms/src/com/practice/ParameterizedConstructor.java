package com.practice;

public class ParameterizedConstructor {

	String name;
	int number;
	public ParameterizedConstructor(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	void show() {
		System.out.println(name + " " + number);
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor firstEntry = new ParameterizedConstructor("Brijesh", 56);
		ParameterizedConstructor secondEntry = new ParameterizedConstructor("Vikas", 27);
		firstEntry.show();
		secondEntry.show();
	}

}
