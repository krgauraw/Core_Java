package dev.lara.set;

import java.util.HashSet;

/**
 * Adding differnt type of object into HashSet 
 * @author gauraw
 *
 */
public class P93 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add("abc"); //String Object
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add("hello");
		System.out.println("Set Elements:::"+set);
	}

}
