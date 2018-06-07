package dev.logic.mix.sec.one;

import java.util.Arrays;

/**
 * Find second largest number in an array
 * 
 * @author gauraw
 *
 */
public class SecondLargestNumber {

	public static void main(String[] args) {

		int numbers[] = { 6, 3, 37, 12, 46, 5, 64, 21 };

		// This logic fail for second largest value when at 0 index highest value will come.
		int highest = numbers[0];
		int second_highest = numbers[0];

		/*
		 * // This logic will fail if we provide an array of negative integers
		 * int highest =0; int second_highest =0;
		 */

		for (int n : numbers) {

			if (highest < n) {
				second_highest = highest;
				highest = n;
			} else if (second_highest < n) {
				second_highest = n;
			}
		}
		System.out.println("First Max Number: " + highest);
		System.out.println("Second Max Number: " + second_highest);

		System.out.println("----------------------------");

		//Another way to find - No Chance to fail

		int numbers1[] = { 6, 3, 37, 12, 46, 5, 64, 21 };
		Arrays.sort(numbers1);
		System.out.println("Largest Number: " + numbers1[numbers1.length - 1]);
		System.out.println("Second Largest Number: " + numbers1[numbers1.length - 2]);

	}
}
