package dev.lara.map;

import java.util.TreeMap;

/**
 * TreeMap Sorting on Key demo.
 * @author gauraw
 *
 */
public class P117 
{
	public static void main(String[] args) {
		
		TreeMap tMap=new TreeMap();
		
		tMap.put(5, 100);
		tMap.put(2, 200);
		tMap.put(1, 300);
		tMap.put(3, 400);
		tMap.put(4, 500);
		
		System.out.println("Printing TreeMap Object tMap::::::"+tMap);
		
		TreeMap tMap1=new TreeMap();
		tMap1.put("key5", 100);
		tMap1.put("key2", 200);
		tMap1.put("key1", 300);
		tMap1.put("key3", 400);
		tMap1.put("key4", 500);
		
		System.out.println("Printing TreeMap Object tMap1::::::"+tMap1);	//Here also sorting is done.
	}
}
