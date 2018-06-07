package dev.coll.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Initialize a set using array.
 * For this we need to convert array into list and then pass the list in constructor.
 * @author gauraw
 *
 */
public class P32 {

	public static void main(String[] args) {
		
		Integer[] array=new Integer[]{10,20,30,40,50};
		
		Set<Integer> set=new HashSet<Integer>(Arrays.asList(array)); // First array converted into list
		
		System.out.println("set:::::::"+set);
	}
}
