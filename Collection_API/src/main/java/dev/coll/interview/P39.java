package dev.coll.interview;

import java.util.LinkedHashSet;

/**
 * Remove all elements from LinkedHashSet
 * @author gauraw
 *
 */
public class P39 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		System.out.println("LinkedHashSet set:::::::::::"+set);
		
		set.clear();	// Remove all elements
		
		System.out.println("After removing all elements, LinkedHashSet set:::::::::::"+set);
		
	}
}
