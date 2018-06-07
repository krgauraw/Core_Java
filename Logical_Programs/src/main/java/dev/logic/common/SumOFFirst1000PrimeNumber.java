package dev.logic.common;

/*
 * A prime number is a whole number greater than 1, whose only two whole-number factors are 1 and itself. 
 * The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
 * 
 * @author gauraw
 */
public class SumOFFirst1000PrimeNumber {
	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		long sum = 0;

		while (count < 1000) {
			if (isPrime(number)) {
				sum += number;
				count++;
			}
			number++;
		}

		System.out.println("Sum=" + sum);
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
