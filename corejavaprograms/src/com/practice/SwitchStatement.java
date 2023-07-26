package com.practice;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		switch (number) {
		case 1: {

			System.out.println("january");
			break;
		}

		case 2: {

			System.out.println("february");
			break;
		}
		case 3: {

			System.out.println("march");
			break;
		}
		case 4: {

			System.out.println("april");
			break;
		}
		case 5: {

			System.out.println("may");
			break;
		}
		case 6: {

			System.out.println("june");
			break;
		}
		case 7: {

			System.out.println("july");
			break;
		}
		case 8: {

			System.out.println("august");
			break;
		}
		case 9: {

			System.out.println("september");
			break;
		}
		case 10: {

			System.out.println("october");
			break;
		}
		case 11: {

			System.out.println("november");
			break;
		}
		case 12: {

			System.out.println("december");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}

	}

}
