package dev.coll.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Convert set into an array.
 * In order to convert a set to an array. we need to convert it list first and then we can convert to an array.
 * @author gauraw
 *
 */
public class P31 {

	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		
		System.out.println("set::::::::;"+set);
		
		// converting set to list
		ArrayList<Integer> list=new ArrayList<Integer>(set); //Here set has been passed as initial data for list
		System.out.println("list::::::::::"+list);
		
		Object[] array=list.toArray(); // Return type is Object only . getting array from list here.
		
		System.out.print("array elements:::::::::::");
		for(Object o: array){
			System.out.print((int)o+" ");
		}
		
		
	}
}
