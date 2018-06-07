package demo.exception.set.one;

/**
 * exception propagation demo. Exception object will be thrown to caller
 * position if not handled
 * 
 * @author gauraw
 *
 */
public class P3 {

	static void test() {
		System.out.println(3);
		int i = 10 / 0; // throw exception object to main because not handled in this method
		System.out.println(4);
	}

	public static void main(String[] args) {

		System.out.println(1);
		test();
		System.out.println(2);
	}

	/*
	 * 1 3 Exception in thread "main" java.lang.ArithmeticException: / by zero
	 * at dev.exception.set1.P3.test(P3.java:12) at
	 * dev.exception.set1.P3.main(P3.java:19)
	 */
}