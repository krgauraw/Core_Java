package dev.coll.interview;

import java.util.LinkedHashSet;

/**
 * get size of Java LinkedHashSet
 * @author gauraw
 *
 */
public class P37 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		System.out.println("LinkedHashSet set:::::::::::;;"+set);
		System.out.println("size of set:::::::::"+set.size());
	}
}
