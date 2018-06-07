package dev.coll.interview;

import java.util.LinkedHashMap;

/**
 * get size of LinkedHashMap
 * @author gauraw
 *
 */
public class P51 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer,String>();
		
		map.put(1, "Hi");
		map.put(2, "Hello");
		map.put(3, "Hey");
		
		System.out.println("LinkedHashMap:::::::::::::"+map);
		System.out.println("No of Elements in map:::::::"+map.size());
	}
}
