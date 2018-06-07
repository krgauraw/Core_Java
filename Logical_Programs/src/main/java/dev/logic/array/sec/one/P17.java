package dev.logic.array.sec.one;

/**
 * Comparing the elements with average value
 * 
 * @author gauraw
 *
 */
public class P17 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum / array.length;

		//comparing every element with average value
		for (int i = 0; i < array.length; i++) {
			if (array[i] > avg) {
				System.out.println("@Index " + i + " value:" + array[i] + " is greater than average value:" + avg);
			} else if (array[i] < avg) {
				System.out.println("@Index " + i + " value:" + array[i] + " is less than average value:" + avg);
			} else if (array[i] == avg) {
				System.out.println("@Index " + i + " value:" + array[i] + " is equal to average value:" + avg);
			}
		}
	}
}
