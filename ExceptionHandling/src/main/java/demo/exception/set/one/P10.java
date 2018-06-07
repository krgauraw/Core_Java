package demo.exception.set.one;

/**
 * OutOfMemoryError
 * 
 * @author gauraw
 *
 */
public class P10 {

	public static void main(String[] args) {

		System.out.println(1);
		int x[] = new int[999999999]; // java.lang.OutOfMemoryError: Java heap space will be thrown from here. RTE
		System.out.println(2);
	}
}