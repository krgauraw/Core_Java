package dev.coll.interview;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * get Set View of Keys from LinkedHashMap
 * @author gauraw
 *
 */
public class P52 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer,String>();
		
		map.put(1, "Hi");
		map.put(2, "Hello");
		map.put(3, "Hey");
		
		System.out.println("LinkedHashMap map:::::::::::::"+map);
		
		Set<Integer> keys=map.keySet();
		System.out.println("Set View of Keys::::::::;"+keys);
	}
}
