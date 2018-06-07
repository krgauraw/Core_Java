package demo.exception.set.one;

/**
 * NumberFormatException demo
 * 
 * @author gauraw
 *
 */
public class P5 {

	public static void main(String[] args) {
		System.out.println(1);
		int i = Integer.parseInt("Hello"); // java.lang.NumberFormatException: For input string: "Hello" will be thrown from here
		System.out.println(2);

	}
}