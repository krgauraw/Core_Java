package dev.lara.set;

import java.util.HashSet;

/**
 * Adding different type of object into HashSet.
 * @author gauraw
 *
 */
public class P92 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add(10); //Integer Object
		set.add("10"); //String Object
		set.add(10.0);	//Double Object
		
		System.out.println("HashSet elements:::"+set); // All are different object. so set will accept .
	}

}
