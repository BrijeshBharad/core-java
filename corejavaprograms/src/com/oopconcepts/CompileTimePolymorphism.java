package com.oopconcepts;

//Overloading
public class CompileTimePolymorphism {

	void toShow(int rollNo) {
		System.out.println("The rollno is" + " " + rollNo);
	}

	void toShow(int rollNo, String name) {
		System.out.println("The rollno is" + " " + rollNo + " " + "and the name is " + name);
	}

	public static void main(String[] args) {
		CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
		compileTimePolymorphism.toShow(25);
		compileTimePolymorphism.toShow(36, "Vivek");
	}

}
