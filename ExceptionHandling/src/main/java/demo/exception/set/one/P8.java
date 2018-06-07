package demo.exception.set.one;

/**
 * java.lang.StackOverflowError will be thrown due to endless recursive call of
 * main().
 * 
 * @author gauraw
 *
 */
public class P8 {

	public static void main(String[] args) {

		System.out.println(1);
		main(args);
		System.out.println(2);
	}
}