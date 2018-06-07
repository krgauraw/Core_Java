package dev.logic.array.sec.one;

/**
 * Find out array is left strength or right strength
 * 
 * @author gauraw
 *
 */
public class P18 {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int leftSum = 0, rightSum = 0;
		int mid = array.length / 2;

		for (int i = 0; i < mid; i++) {
			leftSum += array[i];
		}

		for (int i = mid; i < array.length; i++) {
			rightSum += array[i];
		}

		if (leftSum > rightSum)
			System.out.println("Left Side Strengthy");
		else if (leftSum < rightSum)
			System.out.println("Right side Strengthy");
		else if (leftSum == rightSum)
			System.out.println("Both Side equal Strengthy");
	}
}
