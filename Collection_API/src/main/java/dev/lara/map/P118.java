package dev.lara.map;

import java.util.TreeMap;

/**
 * Adding different type of object into TreeMap
 * @author gauraw
 *
 */
public class P118 
{
	public static void main(String[] args) {
		
		TreeMap tMap=new TreeMap();
		
		tMap.put(80, "abc");
		tMap.put("abc","abc");
		
		 /*
		  * Exception because not able to perform shorting due to different data type.
		  * java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String*/
		
		System.out.println("tMap object::::::::"+tMap);
	}
}
