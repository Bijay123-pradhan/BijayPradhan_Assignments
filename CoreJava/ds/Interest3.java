package com.cg.ds;

import java.util.Scanner;

public class Interest3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Principle amount :");
		int p = s.nextInt();
		
		System.out.println("Enter your interest rate : ");
        double r = s.nextDouble();
		
		System.out.println("Enter your time in years :");
        int t = s.nextInt();

		double SI = p * t * r * 0.01;
		double CI = p * Math.pow(1 + r * 0.01, t) - p;
         
		System.out.println(".......................................");
		
		System.out.println(" You have to pay  Simple Interest: " + (int) SI);
		System.out.println(" You have to pay Compound Interest: " + (int) CI);

	}
}