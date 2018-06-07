package dev.lara.map;

import java.util.HashMap;

/**
 * Read Value from map using get()
 * value can be obtained from a map object using get() if key is known. 
 * @author gauraw
 *
 */
public class P107 {

	public static void main(String[] args) {
		
		HashMap map1=new HashMap<>();
		
		map1.put("a", 100);
		map1.put("b", 150);
		map1.put("c", 200);
		map1.put("d", 250);
		
		//Reading data from map using get()
		System.out.println("value for key=a::::"+map1.get("a"));
		
		//if record found in map, get() returns the value otherwise it returns null
		System.out.println("value for key=b::::"+map1.get(new String("b")));
		
		System.out.println("value for key=c::::"+map1.get("c"));
		
		//casting is required here.
		int d=(int)map1.get("d");
		
		System.out.println("Printing d::::"+d);
		
		//still casting is required here because we haven't provided type 
		//while creating map object. so by default type will be Object type.
		
		Integer dVal=(Integer)map1.get("d");
		
		System.out.println("Printing dVal::::"+dVal);
		
		//key "e" is not present. so get() returns null
		System.out.println("value for key=e:::This Key is not available::::"+map1.get("e"));
	}
}
