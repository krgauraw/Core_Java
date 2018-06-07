package dev.coll.interview;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Removing all elements. clear() method will be used.
 * @author gauraw
 *
 */
public class P35 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);
		
		HashSet<Integer> set=new HashSet<Integer>(list); // creating set object with same elements present in list
		
		System.out.println("list::::::"+list);
		list.clear(); //Remove all elements
		System.out.println("After Removing all element using clear(), list :::::::::::::"+list);
		
		
		System.out.println("set::::::"+set);
		set.clear(); //Remove all elements
		System.out.println("After Removing all element using clear(), set :::::::::::::"+set);
		
		
	}
}
