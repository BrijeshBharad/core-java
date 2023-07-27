package com.OopConcepts;

public class TryCatchExample {

	public static void main(String[] args) {
		int upperVar = 50;
		int downVar = 0;

		try {
			int result = upperVar / downVar;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("this is not valide values");
		}
	}
}