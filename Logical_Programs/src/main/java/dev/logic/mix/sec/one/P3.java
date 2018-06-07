package dev.logic.mix.sec.one;

/**
 * wap to print all even numbers between 1 and 100.
 * 
 * @author gauraw
 *
 */
public class P3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
