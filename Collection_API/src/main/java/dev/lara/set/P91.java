package dev.lara.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Read data from set
 * @author gauraw
 *
 */
public class P91 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println("HashSet elements:::"+set); //Insertion order is not preserved in HashSet.
		
		// we can't read one element from set. No index, No key is available inside set.
		//we can read all record of a set using iterator.
		
		Iterator itr=set.iterator();
		System.out.println("Reading set elements using Iterator:::");
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}

}
