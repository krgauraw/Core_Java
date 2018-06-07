package dev.coll.interview;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Insert all elements of other collection at sspecified index of ArrayList
 * @author gauraw
 *
 */
public class P20 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("list:::::::"+list);
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(300);
		System.out.println("v:::::::::::"+v);
		
		// Insert all element of Vector to ArrayList at index 1.
		list.addAll(1,v);
		
		System.out.println("After adding Vector Object to list at index 1, list::::::::::;"+list);
		
		System.out.println("");
	}
}
