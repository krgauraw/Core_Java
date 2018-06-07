package dev.logic.patterns;

import java.util.Scanner;

/**
 * print Star Trianle With User Input
 * 
 * @author gauraw
 *
 */
public class P2 {
	public static void main(String[] args) {
		System.out.println("How Many Lines you want?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (i * 2 - 1); k++) {
				System.out.print("*");
			}

			System.out.println("");
		}

	}
}
