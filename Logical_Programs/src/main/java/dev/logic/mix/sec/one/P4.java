package dev.logic.mix.sec.one;

/**
 * wap to print all numbers which are multiples of 5 between 1 and 100.
 * 
 * @author gauraw
 *
 */
public class P4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
