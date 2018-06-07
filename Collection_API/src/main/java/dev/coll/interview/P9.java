package dev.coll.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

/**
 * copy elements of ArrayList to Java Vector
 * @author gauraw
 *
 */
public class P9 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
	
		
		System.out.println("ArrayList list::::"+list);
		
		Vector<String> v1=new Vector<String>();
		
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.add("D");
		v1.add("E");
		v1.add("F");
		v1.add("G");
		System.out.println("Vector v1:::::"+v1);
		
		Collections.copy(v1, list); // all elements of v1 is replaced by list element till index location available in list.
		
		System.out.println("After copy list to v1, v1 elements::::"+v1);
	}
}
