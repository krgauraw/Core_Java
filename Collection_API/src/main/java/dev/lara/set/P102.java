package dev.lara.set;

import java.util.Collections;
import java.util.TreeSet;

/**
 * Sorting TreeSet elements in reverse order.
 * We can specify the sorting order at the time of Object creation itself.
 * @author gauraw
 *
 */
public class P102 {

	public static void main(String[] args) {
		
		TreeSet tSet=new TreeSet(Collections.reverseOrder());	// we can specify sorting order at the time of object creation itself.
		tSet.add(1.5);
		tSet.add(1.7);
		tSet.add(4.6);
		tSet.add(0.5);
		tSet.add(9.9);
		tSet.add(10.0);
		// sorting done in reverse order.
		System.out.println("tSet elements:::"+tSet);
	}

}
