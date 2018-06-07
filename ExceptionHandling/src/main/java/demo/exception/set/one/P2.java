package demo.exception.set.one;

/**
 * ArrayIndexOutOfBoundsException demo
 * 
 * @author gauraw
 *
 */
public class P2 {

	public static void main(String[] args) {

		int x[] = { 10, 20, 30 };
		System.out.println(1);
		int i = x[9]; //9th index is not present in x array. java.lang.ArrayIndexOutOfBoundsException: 9 will come.
		System.out.println(2);
	}
}