package dev.logic.array.sec.two;

import java.util.Arrays;

/**
 * wap to retain one array elements from another array.
 * 
 * @author gauraw
 *
 */
public class P39 {
	public static void main(String[] args) {
		int[] x = { 10, 20, 55, 2, 4, 12, 34, 55, 5, 2, 20 };
		int[] y = { 2, 5, 20, 55 };

		System.out.println("x:" + Arrays.toString(x));
		System.out.println("y:" + Arrays.toString(y));

		int found = 0;
		int n = x.length;
		boolean flag = true;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				found++;

				for (int k = 0; k < n - 1; k++) {
					x[k] = x[k + 1];
				}

				n--;
				i--;
			} else {
				flag = true;
			}
		}

		int[] z = new int[x.length - found];

		for (int i = 0; i < z.length; i++) {
			z[i] = x[i];
		}
		System.out.println("x:" + Arrays.toString(x));
		System.out.println("z:" + Arrays.toString(z));
	}
}
