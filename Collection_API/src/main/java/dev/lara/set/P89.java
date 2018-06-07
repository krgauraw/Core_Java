package dev.lara.set;

import java.util.HashSet;

/**
 * Add element to HashSet
 * @author gauraw
 *
 */
public class P89 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(new Integer(40)); 	// No Duplicates allowed in set
		set.add(40);	// No duplicate element
		
		System.out.println("Set elements:::"+set);
		System.out.println("Set elements size:::"+set.size());
		
	}

}
