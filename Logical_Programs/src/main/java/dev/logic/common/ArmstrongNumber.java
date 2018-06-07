package dev.logic.common;

import java.util.Scanner;

/*
 * 
 * An Armstrong number of three digits is an integer such that the sum of the cubes of 
 * its digits is equal to the number itself. 
 * For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371. 
 * 
 * @author gauraw
 */
public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum = 0, temp, r;

		temp = num;

		while (num != 0) {
			r = num % 10;
			num = num / 10;
			sum = sum + (r * r * r);
		}
		if (sum == temp)
			System.out.println(temp + " is an Armstrong number");
		else
			System.out.println(temp + " is not an Armstrong number");

	}
}
