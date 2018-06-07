package dev.lara.mix;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

/**
 * Convert map data to set and then sort using TreeSet Object.
 * @author gauraw
 *
 */
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hMap=new HashMap<String,Integer>();
		hMap.put("key1", 10);
		hMap.put("key2", 20);
		hMap.put("key3", 30);
		hMap.put("key4", 40);
		hMap.put("key5", 50);
		
		System.out.println("HashMap Object hMap elements::::"+hMap);
		
		Set<Entry<String,Integer>> entries=hMap.entrySet(); // getting all entries inside map object
		
		TreeSet<Entry<String,Integer>> set= new TreeSet<Entry<String,Integer>>(
				new Comparator<Entry<String,Integer>>() {

					@Override
					public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
						// TODO Auto-generated method stub
						return o1.getValue().compareTo(o2.getValue());
					}
				}
				); 
		
		set.addAll(entries);
		System.out.println("TreeSet Object set elements::::::::::"+set);
	}

}
