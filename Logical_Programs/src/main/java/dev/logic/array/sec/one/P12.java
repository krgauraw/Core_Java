package dev.logic.array.sec.one;

import java.util.Arrays;

/**
 * Find out minimum value inside an array
 * 
 * @author gauraw
 *
 */
public class P12 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Array contains:::::" + Arrays.toString(array));
		System.out.println("Min Value::" + min);
	}
}
