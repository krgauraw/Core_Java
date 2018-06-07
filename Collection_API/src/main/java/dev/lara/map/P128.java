package dev.lara.map;

import java.util.TreeMap;

/**
 * some utitlity methods demo with TreeMap object. Look into code.
 * @author gauraw
 *
 */
public class P128 {

	public static void main(String[] args) {
		
		TreeMap map=new TreeMap();
		map.put(90, "abc");
		map.put(9, "xyz");
		map.put(0, "Hi");
		map.put(910, "Hello");
		map.put(50, "Java");
		map.put(2, "J2EE");
		
		System.out.println("map elements::::::::"+map);
		
		System.out.println("map.ceilingKey(45):::"+map.ceilingKey(45));
		System.out.println("map.floorKey(45):::"+map.floorKey(45));
		System.out.println("map.headMap(100)::::"+map.headMap(100));
		System.out.println("map.headMap(90)::::"+map.headMap(90));
		System.out.println("map.tailMap(90)::::"+map.tailMap(90));
		System.out.println("map.headMap(90,true)::::"+map.headMap(90,true));
		System.out.println("map.tailMap(90,true)::::"+map.tailMap(90,true));
		
	}

}
