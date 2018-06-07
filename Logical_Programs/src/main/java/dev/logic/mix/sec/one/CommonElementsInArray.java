package dev.logic.mix.sec.one;

/**
 * Write a program to identify common elements or numbers between two given
 * arrays.
 * 
 * @author gauraw
 *
 */
public class CommonElementsInArray {

	public static void main(String[] args) {

		int[] arr1 = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
				}
			}
		}
	}
}
