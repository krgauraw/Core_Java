package demo.exception.set.one;

/**
 * ArithmeticException demo
 * 
 * @author gauraw
 *
 */
public class P1 {

	public static void main(String[] args) {

		System.out.println(1);
		int i = 10 / 0; // RTE : throw java.lang.ArithmeticException: / by zero exception .
		System.out.println(2);
	}
}