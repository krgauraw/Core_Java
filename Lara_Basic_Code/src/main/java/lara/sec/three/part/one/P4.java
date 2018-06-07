package lara.sec.three.part.one;

/**
 * @author gauraw
 *
 */
public class P4 {
	void test1() {
		System.out.println("from test1()");
	}

	static void test2() {
		// CTE :Cannot make a static reference to the non-static method test1()
		// from the type P4
		// test1();
		System.out.println("from test2()");
	}
}
