package dev.coll.interview;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * get Head Set from TreeSet
 * @author gauraw
 *
 */
public class P42 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(40);
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(50);
		set.add(60);
		
		System.out.println("TreeSet set elements:::::::::"+set);
		
		SortedSet<Integer> headSet=set.headSet(new Integer(30)); // will provide element till head point 30. Head Element will be excluded.
		
		System.out.println("head set of 30:::::"+headSet);
	}
}
