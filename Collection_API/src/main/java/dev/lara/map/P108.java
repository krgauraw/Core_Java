package dev.lara.map;

import java.util.HashMap;

/**
 * Uses of null keyword with Map Object.
 * @author gauraw
 *
 */
public class P108 {

	public static void main(String[] args) {

		HashMap map1=new HashMap();
		
		//one null key and multiple null value can be inserted into a map object.
		
		map1.put(null, 100);
		map1.put("a", 200);
		map1.put("b", 300);
		map1.put("c", null);
		map1.put("d", null);
		map1.put("e", null);
		
		//trying to add one more record with null key
		map1.put(null, 20000);	//this will not insert a new record. It will update the value of key "null", because a map can't have duplicate key.

		System.out.println("Printing HashMap object::::map1:::"+map1);
	}

}
