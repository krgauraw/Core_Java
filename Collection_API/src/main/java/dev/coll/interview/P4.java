package dev.coll.interview;

/**
 * Extend size of an array
 * @author gauraw
 *
 */
public class P4 {

	public static void main(String[] args) {
		
		String cars[]={"A","B","C"};
		String[] extended=new String[5];
		extended[3]="D";
		extended[4]="E";
		
		System.arraycopy(cars, 0, extended, 0, cars.length);  // cars elements will be copied to extended array
		
		for (String ch : extended) {
			System.out.print(ch+" ");
		}
	}
}
