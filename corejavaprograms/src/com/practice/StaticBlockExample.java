package com.practice;

class main {

	static int staticVarible;

	static {
		staticVarible = 15;
		System.out.println("static block called");
	}

}

class StaticBlockExample {

	public static void main(String[] args) {
		System.out.println(main.staticVarible);
	}

}
