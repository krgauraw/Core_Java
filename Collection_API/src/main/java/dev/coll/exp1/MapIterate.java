package dev.coll.exp1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Iterate map in different ways
 * @author gauraw
 *
 */
public class MapIterate {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "ABC");
		map.put(2, "Hello");
		map.put(3, "Hi");
		map.put(4, "Hey");
		System.out.println("HashMap map elements::::::::::::::"+map);
		System.out.println("----------------------------------------------");
		System.out.println();
		
		//Method 1 :::::::::::Iterate map using advanced for loop 
		System.out.println("Iterating Map using for each loop::::::::::start");
		
		for(Integer key:map.keySet()){
			
			System.out.println("Key = "+key+", Value = "+map.get(key));
		}
		
		System.out.println("Iterating Map using for each loop::::::::::end");
		System.out.println("----------------------------------------------");
		System.out.println();
		
		//Method 2 ::::::::::::Iterate map using KeySet & Iterator
		System.out.println("Iterating Map using KeySet Iterator::::::::::start");
		
		Set<Integer> keySet=map.keySet();
		Iterator<Integer> keySetIterator=keySet.iterator();
		
		while(keySetIterator.hasNext()){
			
			int key=keySetIterator.next();
			System.out.println("Key = "+key+", Value = "+map.get(key));
		}
		
		System.out.println("Iterating Map using KeySet Iterator::::::::::end");
		System.out.println("----------------------------------------------");
		System.out.println();
		
		//Method 3 :::::::::::::::Iterate Map using EntrySet and for each loop
		System.out.println("Iterating Map using EntrySet & for each loop::::::::::start");
		
		Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
		
		for(Entry entry:entrySet){
			
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		
		System.out.println("Iterating Map using EntrySet & for each loop::::::::::end");
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		
		//Method 4 :::::::::::::::Iterate Map using EntrySet and Iterator
		System.out.println("Iterating Map using EntrySet & Iterator::::::::::start");
		
		Set<Map.Entry<Integer, String>> entrySet1=map.entrySet();
		Iterator<Entry<Integer, String>> entrySetIterator = entrySet1.iterator();
		while(entrySetIterator.hasNext()){
			Entry entry = entrySetIterator.next();
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
		
		System.out.println("Iterating Map using EntrySet & Iterator::::::::::end");
		System.out.println("---------------------------------------------------------");
		System.out.println();
	}
}
