package com.practice;

public class DefineAge {

	public static void main(String[] args) {

		int age = 7;

		if (age < 12) {
			System.out.println("it's a child");
		}
		if (12 < age && age < 18) {
			System.out.println("it's a teenager");

		}
		if (18 <= age && age < 58) {
			System.out.println("it's a man");
		}
		if (age > 58) {
			System.out.println("it's a old man");
		} 

	}
}