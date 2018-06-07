package dev.coll.interview;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * get synchronized set from TreeSet
 * @author gauraw
 *
 */
public class P40 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(40);
		set.add(10);
		set.add(30);
		set.add(20);
		
		System.out.println("TreeSet set elements:::::::::"+set);
		
		Set syncSet=Collections.synchronizedSet(set);	// getting synchronized set
		
		System.out.println("Synchronized TreeSet set elements:::::::::"+syncSet);
		
	}
}
