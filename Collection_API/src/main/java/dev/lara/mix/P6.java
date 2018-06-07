package dev.lara.mix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Not clear. used Collections.synchronized() over list,set & map.
 * @author gauraw
 *
 */
public class P6 {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list=Collections.synchronizedList(list);	//get synchronized list
		
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		
		System.out.println("Pritning list::::::"+list);
		
		Set<Integer> set=new HashSet<Integer>();
		set=Collections.synchronizedSet(set);
		
		set.add(90);
		set.add(9);
		set.add(9010);
		
		System.out.println("Pritning set::::::"+set);
		
		Map<String, Integer> map=new HashMap<String,Integer>();
		map=Collections.synchronizedMap(map);
		
		map.put("key1", 20);
		map.put("key2",40);
		map.put("key3", 60);
		
		System.out.println("Printing map:::::"+map);
	}
}
