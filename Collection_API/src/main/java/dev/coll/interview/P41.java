package dev.coll.interview;

import java.util.TreeSet;

/**
 * Copy all elements in TreeSet to an Object array
 * @author gauraw
 *
 */
public class P41 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(40);
		set.add(10);
		set.add(30);
		set.add(20);
		
		System.out.println("TreeSet set elements:::::::::"+set);
		
		Object[] array=set.toArray();	// converting TreeSet to Object array
		
		System.out.print("Printing Object array::::");
		for(Object obj:array){
			System.out.print(obj+" ");
		}
	}
}
