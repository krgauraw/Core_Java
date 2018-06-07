package dev.logic.array.sec.two;

import java.util.Arrays;

/**
 * wap to develop 3rd array with the common elements of two given arrays.
 * 
 * @author gauraw
 *
 */
public class P40 {
	public static void main(String[] args) {
		int[] x = { 10, 20, 30, 40, 50, 50, 70, 80, 2, 4, 8 };
		int[] y = { 2, 60, 1000, 4, 20, 13 };

		int size = x.length > y.length ? y.length : x.length;

		int[] z = new int[size];

		int index = 0;

		boolean flag = true;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					for (int k = 0; k < index; k++) {
						if (z[k] == x[i]) {
							flag = false;
							break;
						}
					}
					if (flag) {
						z[index++] = x[i];
						break;
					} else {
						flag = true;
						break;
					}
				}
			}

		}

		int[] p = new int[index];
		for (int i = 0; i < index; i++) {
			p[i] = z[i];
		}

		System.out.println("x:" + Arrays.toString(x));
		System.out.println("y:" + Arrays.toString(y));
		System.out.println("z:" + Arrays.toString(z));
		System.out.println("p:" + Arrays.toString(p));
	}
}
