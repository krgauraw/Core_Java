package dev.logic.common;

import java.util.Scanner;

/*
 * A palindrome number is a number such that if we reverse it, it will not change. 
 * 
 * For example some palindrome numbers examples are 121, 212, 12321, -454. 
 * 
 * To check whether a number is palindrome or not first we reverse it and then compare 
 * the number obtained with the original, 
 * if both are same then number is palindrome otherwise not.
 * 
 * @author gauraw
 */
public class PalindromeNumber {
	public static void main(String args[]) {
		int r, sum = 0, temp;

		System.out.println("Please Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		temp = n;

		while (n > 0) {
			r = n % 10; //getting remainder  
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (temp == sum)
			System.out.println(temp + " is palindrome number ");
		else
			System.out.println(temp + " is not palindrome number");
	}
}
