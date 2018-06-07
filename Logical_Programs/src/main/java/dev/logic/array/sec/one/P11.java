package dev.logic.array.sec.one;

import java.util.Arrays;

/**
 * Find out max value from array
 * 
 * @author gauraw
 *
 */
public class P11 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Array contains:::::" + Arrays.toString(array));
		System.out.println("Max Value::" + max);
	}
}
