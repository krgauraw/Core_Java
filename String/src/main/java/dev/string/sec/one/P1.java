package dev.string.sec.one;

/**
 * @author gauraw
 *
 */
public class P1 {

	public static void main(String[] args) {

		String s1 = "abc";
		// called as String literal. object s1 will be created in String Constant Pool
		System.out.println(s1);
		// content is printing because toString() is overrided in String class.
	}
}
