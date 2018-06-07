package dev.logic.array.sec.two;

/**
 * wap for linear search in array
 * 
 * @author gauraw
 *
 */
public class P37 {
	public static void main(String[] args) {
		int[] array = { 10, 2, 5, 3, 13, 7, 20, 15 };

		int i = search(array, 20);
		System.out.println(i);
	}

	public static int search(int[] array, int y) {
		int index = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == y) {
				index = i;
				break;
			}
		}
		return index;
	}
}
