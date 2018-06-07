package lara.sec.three.part.one;

/**
 * @author gauraw
 *
 */
public class P2 {

	/**
	 * Non static method
	 */
	void test() {

	}

	public static void main(String[] args) {
		// CTE : Cannot make a static reference to the non-static method test() from the type P2
		// test();
		System.out.println("Done!");
	}
}
