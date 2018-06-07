package dev.lara.map;

import java.util.HashMap;
import java.util.Map;


/**
 * Insert record into map
 * while dealing with map, key should be unique.
 * To identify unique key, HashMap uses hashcode() and equals().
 * @author gauraw
 *
 */
public class P106 {
	
	public static void main(String[] args) {
		
		HashMap map1=new HashMap();
		
		//put() method is used to insert record into map. Insertion order is not preserved in HashMap.
		
		//autoboxing will be done by jvm
		map1.put("1", "Hello");
		map1.put("2", "Hi");
		map1.put("3", "Hey");
		
		//in another way
		map1.put(new String("4"), new String("How are you?"));
		
		//reading directly using sop
		System.out.println("Printing HashMap Object:::map1:::"+map1);
		
		//additional code - start
		
		System.out.println("---------------------------------------------------------");
		
		//Creating another map object
		
		Map<Integer, String> map2=new HashMap<Integer,String>();
		
		map2.put(1, "Hi from map 2");
		map2.put(new Integer(2), "Hello from map2");
		map2.put(new Integer(3), new String("Hey from map 2"));
		map2.put(4, new String("How are you ? I am from map2"));
		
		System.out.println("Printing HashMap Object:::map2:::"+map2);
		
		
	}

}
