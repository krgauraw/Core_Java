package demo.exception.set.one;

/**
 * Exception Propagation demo
 * 
 * @author gauraw
 *
 */
public class P4 {

	static void test1() {
		System.out.println(3);
		test2();
		System.out.println(4);
	}

	static void test2() {
		System.out.println(5);
		String s1 = null;
		System.out.println(s1.length()); // NullPointerException will be thrown from here to test1() and then main()
	}

	public static void main(String[] args) {

		System.out.println(1);
		test1();
		System.out.println(2);
	}
}