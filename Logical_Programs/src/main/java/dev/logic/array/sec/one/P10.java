package dev.logic.array.sec.one;

/**
 * Read first half even indexed and second half odd indexed elements of an array
 * 
 * @author gauraw
 *
 */
public class P10 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80 };

		int mid = array.length / 2;

		for (int i = 0; i < mid; i += 2) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("-------------");
		if (mid % 2 == 0) {
			mid++;
		}

		for (int i = mid; i < array.length; i += 2) {
			System.out.print(array[i] + " ");
		}
	}
}
