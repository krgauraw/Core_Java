package dev.lara.mix;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Creating HashMap object with Supplying wrapper class as type and further creating TreeMap Object by using HashMap Object.
 * @author gauraw
 *
 */
public class P3 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hMap=new HashMap<String,Integer>();
		hMap.put("key1", 10);
		hMap.put("key2", 20);
		hMap.put("key3", 30);
		hMap.put("key4", 40);
		hMap.put("key5", 50);
		
		System.out.println("HashMap Object hMap elements::::"+hMap);
		
		TreeMap<String, Integer> tMap=new TreeMap<String,Integer>(hMap); //HashMap object is passed as input
		
		System.out.println("TreeMap Object tMap elements::::"+tMap);
	}
}
