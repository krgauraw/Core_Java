package dev.lara.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Read set elements using iterator
 * @author gauraw
 *
 */
public class P99 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add("abc"); //String Object
		set.add(10);
		set.add(20);
		set.add(true);
		set.add('a');
		set.add(30);
		set.add(40);
		set.add("hello");
		System.out.println("Set Elements:::"+set);
		
		Iterator itr=set.iterator();
		System.out.println("Reading set elemnets using Iterator::");
		while(itr.hasNext()){
			System.out.print(itr.next()+",");
		}
	}

}
