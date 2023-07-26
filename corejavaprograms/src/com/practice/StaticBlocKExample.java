package com.practice;

 class main  {
int nonStatic;
static int staticVarible;
	
	static {
		staticVarible=15;
		System.out.println("static block called");
	}
}
 class StaticBlocKExample{
	public static void main(String[] args) {
		System.out.println(main.staticVarible);
	}
}
