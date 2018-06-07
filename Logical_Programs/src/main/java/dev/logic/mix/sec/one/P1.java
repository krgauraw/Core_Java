package dev.logic.mix.sec.one;

import java.util.Scanner;

/**
 * wap to reverse any word given by user and the reversed word should have all
 * character at even index location in upper case
 * 
 * @author gauraw
 *
 */
public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter A Word:");
		String s1 = sc.next();

		for (int i = s1.length() - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.print(s1.toUpperCase().charAt(i));
			} else {
				System.out.print(s1.toLowerCase().charAt(i));
			}
		}
	}
}
