package dev.coll.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Adding all elements of another collection to set using addAll().
 * @author gauraw
 *
 */
public class P34 {

	public static void main(String[] args) {
		
		Integer[] array=new Integer[]{10,20,30,40,50};
		
		Set<Integer> set=new HashSet<Integer>(Arrays.asList(array)); // First array converted into list
		
		System.out.println("set:::::::;"+set);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);
		System.out.println("list::::::"+list);
		
		set.addAll(list);	// adding all elements of list into set
		
		System.out.println("set after adding entire list:::::::"+set);
	}
}
