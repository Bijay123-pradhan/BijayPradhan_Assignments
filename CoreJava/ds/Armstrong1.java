package com.cg.ds;
import java.util.Scanner;

public class Armstrong1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number:");
		int arm = s.nextInt();
		int temp = arm;
		int sum = 0;
		while (temp > 0) {
			int dif = temp % 10;
			sum = sum + dif * dif * dif;
			temp /= 10;
		}
		s.close();
		if (arm == sum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}
}