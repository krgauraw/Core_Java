package dev.logic.mix.sec.one;

/**
 * what will be the output? output : 2
 * 
 * @author gauraw
 *
 */
public class P9 {

	static int a = 1111;
	static {
		a = a-- - --a;
	}

	{
		a = a++ + ++a;
	}

	public static void main(String[] args) {
		System.out.println(a);
	}
}
