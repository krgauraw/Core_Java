package dev.logic.app.set.one;

import java.util.Scanner;

/**
 * Addition of two numbers without using + operator
 * 
 * @author gauraw
 *
 */
public class P2 {

	public static void main(String[] args) {

		System.out.println("Please Enter Two Numbers:");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		int sum = n1 - (-n2);
		System.out.println("Sum (without using +) of " + n1 + " & " + n2 + " is:" + sum);

	}
}
