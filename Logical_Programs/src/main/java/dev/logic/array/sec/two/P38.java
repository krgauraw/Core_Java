package dev.logic.array.sec.two;

import java.util.Arrays;

/**
 * wap to remove one array elements from another array
 * 
 * @author gauraw
 *
 */
public class P38 {
	public static void main(String[] args) {
		int[] x = { 10, 20, 55, 2, 2, 4, 12, 34, 55, 5, 2, 20 };

		int[] y = { 2, 5, 20, 55 };

		System.out.println("x:" + Arrays.toString(x));
		System.out.println("y:" + Arrays.toString(y));

		int found = 0;
		int n = x.length;

		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < n; j++) {
				if (y[i] == x[j]) {
					found++;

					for (int k = 0; k < x.length - 1; k++) {
						x[k] = x[k + 1];
					}

					n--;
					j--;
				}
			}

		}

		int[] z = new int[x.length - found];

		for (int i = 0; i < z.length; i++) {
			z[i] = x[i];
		}
		System.out.println("z:" + Arrays.toString(z));
	}
}
