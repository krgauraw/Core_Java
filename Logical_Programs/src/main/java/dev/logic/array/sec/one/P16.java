package dev.logic.array.sec.one;

/**
 * Find out average of even indexed and odd indexed seperately
 * 
 * @author gauraw
 *
 */
public class P16 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0, total = 0;
		double avg = 0.0;

		//calculating even indexed average
		for (int i = 0; i < array.length; i += 2) {
			sum += array[i];
			total++;
		}
		avg = sum / total;
		System.out.println("Average of Even Indexed Elements:::" + avg);

		total = 0;
		sum = 0;
		avg = 0.0;

		for (int i = 1; i < array.length; i += 2) {
			sum += array[i];
			total++;
		}

		avg = sum / total;
		System.out.println("average of Odd Indexed Elements:::" + avg);
	}
}
