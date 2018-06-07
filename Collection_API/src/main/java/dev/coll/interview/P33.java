package dev.coll.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Add single element into set using add(). 
 * @author gauraw
 *
 */
public class P33 {

	public static void main(String[] args) {
		
		Integer[] array=new Integer[]{10,20,30,40,50};
		
		Set<Integer> set=new HashSet<Integer>(Arrays.asList(array)); // First array converted into list
		
		set.add(new Integer(100000));	// adding new element into set using add().
		
		System.out.println("set:::::::"+set);
	}
}
