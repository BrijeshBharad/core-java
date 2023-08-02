package com.oopconcepts;

public class TryCatchExample {

	public static void main(String[] args) {
		int upper = 50;
		int down = 0;

		try {
			int result = upper / down;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("This is not valide values");
		}
	}
	
}