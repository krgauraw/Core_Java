package dev.logic.common;

import java.util.Scanner;

/**
 * The Fibonacci sequence is a set of numbers that starts with a one or a zero,
 * followed by a one, and proceeds based on the rule that each number (called a
 * Fibonacci number) is equal to the sum of the preceding two numbers.
 * 
 * @author gauraw
 *
 */
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many fibonacci you want?");
		int count = sc.nextInt();

		int f0 = 0;
		int f1 = 1;
		int f2;
		System.out.println("Fibonacci Series:");
		System.out.print(f0 + " " + f1);

		for (int i = 1; i <= count - 2; i++) {
			f2 = f0 + f1;
			System.out.print(" " + f2);
			f0 = f1;
			f1 = f2;
		}

	}
}
