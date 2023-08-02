package com.practice;

import java.util.Scanner;

public class EmiCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your principl amount");
		double principleAmount = scanner.nextDouble();
		System.out.println("Now please enter your rate of interest ");
		Double interestInPer = scanner.nextDouble();
		System.out.println("Now enter the tenure in months");
		double tenure = scanner.nextDouble();
		Double interest = interestInPer / (12 * 100);
		System.out.println(interest);
		double tenureInMonths = tenure;
		System.out.println(tenureInMonths);
		/*
		 * P x R x (1+R)^N / [((1+R)^N)-1]
		 */

		Double raiseUpper = (Double) Math.pow((1.0 + interest), tenureInMonths);
		Double upper = (principleAmount * interest * raiseUpper);
		Double raiseDown = (Double) Math.pow((1 + interest), tenureInMonths);
		Double down = raiseDown - 1;
		Double emi = upper / down;
		System.out.println(emi);
	}

}
