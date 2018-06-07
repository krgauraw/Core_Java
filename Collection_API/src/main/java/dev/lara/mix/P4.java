package dev.lara.mix;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Creating HashMap Object and then getting ArrayList object from the same HashMap Object
 * Converting map data into list and performing sorting operation over list.
 * @author gauraw
 *
 */
public class P4 {

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
		
		List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(entries);
		
		System.out.println("Ptinting list ::::::::::::::::"+list);
		
		Collections.sort(list,
					new Comparator<Entry<String,Integer>>() {

						@Override
						public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
							return o1.getValue().compareTo(o2.getValue());
						}
					}
				); // sort() ends here
		
		System.out.println("Ptinting list after sorting::::::::::::::::"+list);
	}

}
