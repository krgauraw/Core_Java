package dev.logic.common;

import java.util.Scanner;

/**
 * @author gauraw
 *
 */
public class FibonacciRecursion {
	static int f0 = 0, f1 = 1, f2, count;

	static void printFibonacci(int count) {
		if (count > 0) {

			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
			System.out.print(" " + f2);

			printFibonacci(count - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("How many fibonacci you want:");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		FibonacciRecursion obj = new FibonacciRecursion();

		System.out.println("Fibonacci Series:");
		System.out.print(f0 + " " + f1);
		obj.printFibonacci(count - 2);
	}
}
