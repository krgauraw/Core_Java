package dev.logic.mix.sec.one;

/**
 * @author gauraw
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {

		int rev = 0;
		int num = 1234;
		System.out.println("Actual Number::" + num);

		//Reversing..
		while (num > 0) {
			int rem = num % 10;
			rev = rem + (rev * 10);
			num = num / 10;
		}
		System.out.println("Reversed Number::" + rev);
	}
}
