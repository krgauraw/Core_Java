package dev.logic.app.set.one;

import java.util.Scanner;

/**
 * Subtract two numbers without using - operator
 * 
 * @author gauraw
 *
 */
public class P3 {

	public static void main(String[] args) {

		System.out.println("Please Enter Two Numbers:");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		// Here ~n2+1 will give 1's complement
		int sub = n1 + (~n2 + 1);
		System.out.println("Subtraction (without using -) of " + n1 + " & " + n2 + " is:" + sub);
	}
}
