package com.oopconcepts;

//overloading
public class CompileTimePolymorphism {

	void toShow(int rollno) {
		System.out.println("The rollno is" + " " + rollno);
	}

	void toShow(int rollno, String name) {
		System.out.println("The rollno is" + " " + rollno + " " + "and the name is " + name);
	}

	public static void main(String[] args) {
		CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
		compileTimePolymorphism.toShow(25);
		compileTimePolymorphism.toShow(36, "vivek");
	}

}
