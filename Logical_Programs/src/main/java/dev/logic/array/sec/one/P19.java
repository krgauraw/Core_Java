package dev.logic.array.sec.one;

/**
 * Find out sequential three indexes, where sum of first and second number is
 * third.
 * 
 * @author gauraw
 *
 */
public class P19 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 2, 3, 5, 11, 13, 24 };

		int a, b, c;
		for (int i = 0; i < array.length - 2; i++) {
			a = array[i];
			b = array[i + 1];
			c = array[i + 2];

			if ((a + b) == c) {
				System.out.println("Sequential Indexes are:::" + i + "," + (i + 1) + "," + (i + 2));
			}
		}
	}
}
