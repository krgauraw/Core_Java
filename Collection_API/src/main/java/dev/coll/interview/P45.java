package dev.coll.interview;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * get subset from TreeSet
 * @author gauraw
 *
 */
public class P45 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(40);
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(50);
		set.add(60);
		
		System.out.println("TreeSet set elements:::::::::"+set);
		
		SortedSet<Integer> subSet=set.subSet(new Integer(10), new Integer(40)); // Here 40 will be excluded.
		
		System.out.println("subSet elements:::::::::::"+subSet);
	}
}
