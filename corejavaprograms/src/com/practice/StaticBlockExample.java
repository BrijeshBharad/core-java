package com.practice;

//This static block is used when we want to initialize the static variables
class main {

	static int staticVarible;

	static {
		staticVarible = 15;
		System.out.println("Static block called");
	}

}

class StaticBlockExample {

	public static void main(String[] args) {
		System.out.println(main.staticVarible);
	}

}
