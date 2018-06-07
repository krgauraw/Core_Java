package dev.coll.interview;

import java.util.TreeSet;

/**
 * get size of TreeSet
 * @author gauraw
 *
 */
public class P44 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(40);
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(50);
		set.add(60);
		
		System.out.println("TreeSet set elements:::::::::"+set);
		System.out.println("No of elements in set:::::::::::::"+set.size());
	}
}
