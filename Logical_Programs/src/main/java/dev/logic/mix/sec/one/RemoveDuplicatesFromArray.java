package dev.logic.mix.sec.one;

import java.util.Arrays;

/**
 * Given array is already sorted, and it has duplicate elements. Write a program
 * to remove duplicate elements and return new array without any duplicate
 * elements. The array should contain only unique elements.
 * 
 * @author gauraw
 *
 */
public class RemoveDuplicatesFromArray {

	public static int[] removeDuplicates(int[] input) {

		int j = 0;
		int i = 1;
		//return if the array length is less than 2
		if (input.length < 2) {
			return input;
		}
		while (i < input.length) {
			if (input[i] == input[j]) {
				i++;
			} else {
				input[++j] = input[i++];
			}
		}
		int[] output = new int[j + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = input[k];
		}

		return output;
	}

	public static void main(String a[]) {
		int[] input1 = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		System.out.println("Input Array::::" + Arrays.toString(input1));
		int[] output = removeDuplicates(input1);
		System.out.println("Output Array after removing duplicates::::" + Arrays.toString(output));
	}
}
