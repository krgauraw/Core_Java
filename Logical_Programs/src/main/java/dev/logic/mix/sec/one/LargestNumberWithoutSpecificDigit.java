package dev.logic.mix.sec.one;

/**
 * How To Find Largest Number Less Than Given Number And Without Given Digit?
 * 
 * Reference :
 * http://javaconceptoftheday.com/how-to-find-largest-number-less-than-given-number-and-without-given-digit/
 * 
 * @author gauraw
 *
 */
public class LargestNumberWithoutSpecificDigit {

	static int getLLessThanN(int number, int digit) {
		//Converting digit to char
		char c = Integer.toString(digit).charAt(0);

		//Decrementing number & checking whether it contains digit

		for (int i = number; i > 0; --i) {
			if (Integer.toString(i).indexOf(c) == -1) {
				//If 'i' doesn't contain 'c'
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(getLLessThanN(123, 2));
		System.out.println(getLLessThanN(4582, 5));
		System.out.println(getLLessThanN(98512, 5));
		System.out.println(getLLessThanN(548624, 8));
	}
}
