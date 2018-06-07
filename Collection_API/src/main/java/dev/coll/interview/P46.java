package dev.coll.interview;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * get Tail Set from TreeSet
 * @author gauraw
 *
 */
public class P46 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(40);
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(50);
		set.add(60);
		
		System.out.println("TreeSet set elements:::::::::"+set);
		
		SortedSet<Integer> tailSet=set.tailSet(new Integer(30)); // 30 will be also included.
		System.out.println("tailSet of 30:::::::::::::"+tailSet);
		
		SortedSet<Integer> tailSet1=set.tailSet(new Integer(30),false); // 30 will not be included.
		System.out.println("tailSet of 30 with false inclusive:::::::::::::"+tailSet1);
	}
}
