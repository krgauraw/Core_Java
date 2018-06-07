package dev.lara.map;

import java.util.Hashtable;

/**
 * Insert record into Hashtable Object
 * Hashtable Insert Demo
 * Hashtable doesn't accept any key or value as null. Even a single null value is not allowed.
 * Insertion order is not preserved in Hashtable.
 * @author gauraw
 *
 */
public class P114 {

	public static void main(String[] args) {
		
		Hashtable tab=new Hashtable();
		
		tab.put("test", "Hello");
		tab.put("a", "Hi");
		
		//Hashtable doesn't accept even null as value also. 
		//tab.put("b", null);
		//tab.put("c", null);
		
		//Hashtable doesn't accept null as key.
		//tab.put(null, "Hey"); //Error will come. NullPointerException will come.
		
		System.out.println("Printing Hashtable Object ::::::::::tab::::::::"+tab);

	}

}
