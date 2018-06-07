package dev.coll.interview;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Iterate through elements og LinkedHashSet
 * @author gauraw
 *
 */
public class P38 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		System.out.println("LinkedHashSet set:::::::::::;;"+set);
		
		Iterator<Integer> itr=set.iterator();
		
		System.out.print("Printing through iterator:::::::");
		
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
	
}
