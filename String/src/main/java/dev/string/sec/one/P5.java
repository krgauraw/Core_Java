package dev.string.sec.one;

/**
 * @author gauraw
 *
 */
public class P5 {

	public static void main(String[] args) {

		String s1 = "xyz";
		String s2 = "xyz";

		// String Class overrided toString(), because of this we can print actual hascode.
		// hascode are same because of same content in both literal. So only one object will be created in String Constant pool
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
