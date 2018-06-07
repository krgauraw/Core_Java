package dev.logic.array.sec.one;

import java.util.Arrays;

/**
 * Find out Average of elements in an array
 * 
 * @author gauraw
 *
 */
public class P14 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 17, 39, 22, 11, 111, 13, 49, 99, 261 };
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		avg = sum / array.length;
		System.out.println("Array contains:::::" + Arrays.toString(array));
		System.out.println("Average::" + avg);
	}
}
