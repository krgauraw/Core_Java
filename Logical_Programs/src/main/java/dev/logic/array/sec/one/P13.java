package dev.logic.array.sec.one;

import java.util.Arrays;

/**
 * Find out sum of elements present in an array
 * 
 * @author gauraw
 *
 */
public class P13 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Array contains:::::" + Arrays.toString(array));
		System.out.println("Sum::" + sum);
	}
}
