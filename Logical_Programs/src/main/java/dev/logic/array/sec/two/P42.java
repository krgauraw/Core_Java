package dev.logic.array.sec.two;

import java.util.Arrays;

/**
 * wap to remove range of elements from the given array.
 * 
 * @author gauraw
 *
 */
public class P42 {
	public static void main(String[] args) {
		int[] x = { 1, 3, 5, 7, 9, 10, 20, 11, 23, 25 };

		int n = x.length;

		int from = 3, to = 7;
		System.out.println("x:" + Arrays.toString(x));

		for (int i = from; i < to; i++) {
			for (int j = from; j < n; j++) {
				x[j - 1] = x[j];
			}
			n--;
		}

		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			y[i] = x[i];
		}

		System.out.println("New Array:" + Arrays.toString(y));
	}
}
