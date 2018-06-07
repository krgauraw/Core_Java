package dev.logic.mix.sec.one;

/**
 * Which line will throw compile time error? 11 or 12?
 * 
 * @author gauraw
 *
 */
public class P12 {

	public static void main(String[] args) {
		Integer i = new Integer(null);
		//String s = new String(null);	//CTE
	}
}
