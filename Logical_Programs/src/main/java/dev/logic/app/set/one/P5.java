package dev.logic.app.set.one;

import java.util.Scanner;

/**
 * Program to check whether a number is even or odd without using if else
 * 
 * @author gauraw
 *
 */
public class P5 {

	static void checkEvenOrOdd(int n) {
		switch (n % 2) {
		case 0:
			System.out.println(n + " is an Even Number");
			break;
		case 1:
			System.out.println(n + " is an Odd Number");
		}
	}

	public static void main(String[] args) {

		System.out.println("Please Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		checkEvenOrOdd(n);
	}
}
