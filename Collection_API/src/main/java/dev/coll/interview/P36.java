package dev.coll.interview;

import java.util.HashSet;

/**
 * Remove single element from set using remove().
 * @author gauraw
 *
 */
public class P36 {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		
		System.out.println("set::::::::::"+set);
		set.remove(10);
		System.out.println("After removing 10, set::::::"+set);
		
	}
}
