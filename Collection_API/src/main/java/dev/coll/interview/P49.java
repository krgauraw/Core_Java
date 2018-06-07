package dev.coll.interview;

import java.util.HashMap;

/**
 * check if a particular key exist or not
 * @author gauraw
 *
 */
public class P49 {

	public static void main(String[] args) {
		
HashMap<Integer, String> map=new HashMap<Integer,String>();
		
		map.put(1, "ABC");
		map.put(2, "Hello");
		map.put(3, "Hi");
		map.put(4, "Hey");
		
		System.out.println("HashMap map elements::::::::::::::"+map);
		
		boolean isKeyExist=map.containsKey(new Integer(2));
		System.out.println("Is key 2 exist in map?::::::::::"+isKeyExist);
		
		boolean isKey1Exist=map.containsKey(new Integer(10));
		System.out.println("Is key 10 exist in map?::::::::::"+isKey1Exist);
		
		boolean isValueExist=map.containsValue(new String("Hey"));
		System.out.println("Is value Hey exist in map?::::::::::"+isValueExist);
	}
}
