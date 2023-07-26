package com.practice;

import java.util.Scanner;

public class EmiCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("please enter your principl amount");
		int principleAmount = scanner.nextInt();

		System.out.println("now please enter your rate of interest ");
		Double interestInPer = scanner.nextDouble();

		System.out.println("now enter the tenure in months");
		int tenure = scanner.nextInt();

		Double interest = interestInPer / (tenure * 10);
		System.out.println(interest);
		/*
		 * P x R x (1+R)^N / [(1+R)^N-1]
		 */

		Double raiseUpper = (Double) Math.pow((1.0 + interest), tenure);
		
		Double upper = (principleAmount * interest * raiseUpper);
		
		Double raiseDown = (Double) Math.pow((1 + interest), tenure - 1);
		
		Double emi = upper / raiseDown;
		System.out.println(principleAmount);
		System.out.println(interestInPer);
		System.out.println(tenure);
		System.out.println(raiseUpper);
		System.out.println(upper);
		System.out.println(raiseDown);
		System.out.println(emi);
	}

}
