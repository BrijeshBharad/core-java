package com.practice;

public class ParameterizedConstructor {
	String name_var;
	int number_var;

	public ParameterizedConstructor(String name, int number) {
		name_var = name;
		number_var = number;
	}

	void show() {
		System.out.println(name_var + " " + number_var);
	}

	public static void main(String[] args) {
		ParameterizedConstructor firstEntry = new ParameterizedConstructor("brijesh", 56);
		ParameterizedConstructor secondEntry = new ParameterizedConstructor("vikas", 27);
		firstEntry.show();
		secondEntry.show();
	}

}
