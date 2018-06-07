package dev.logic.app.set.one;

import java.util.Scanner;

/**
 * Number Printing without using loos
 * 
 * @author gauraw
 *
 */
public class P4 {

	static int count = 1;

	static void printNumber(int n) {
		System.out.print(count + " ");
		count++;
		if (count == n + 1) {
			return;
		} else {
			printNumber(n); // Recursive Call
		}
	}

	public static void main(String[] args) {

		System.out.println("Please Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printNumber(n);
	}
}
