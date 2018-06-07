package dev.logic.array.sec.one;

/**
 * Find out Average of first half and second half
 * 
 * @author gauraw
 *
 */
public class P15 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int mid = array.length / 2;
		long sum = 0;
		double avg = 0.0;

		for (int i = 0; i < mid; i++) {
			sum += array[i];
		}

		avg = sum / mid;
		System.out.println("Average of 1st half:::" + avg);
		System.out.println("-------------");

		sum = 0;
		avg = 0;

		for (int i = mid; i < array.length; i++) {
			sum += array[i];
		}

		avg = sum / mid;
		System.out.println("Average of 2nd half:::" + avg);
	}
}
