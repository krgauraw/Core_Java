package dev.lara.mix;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap demo
 * @author gauraw
 *
 */
public class P12 {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String, Integer> map=new ConcurrentHashMap<String,Integer>();
		
		map.put("key1", 10);
		map.put("key2", 20);
		map.put("key3", 30);
		map.put("key4", 40);
		
		System.out.println("map elements::::"+map);
		
		Iterator<String> itr=map.keySet().iterator();
		
		map.put("key5", 50);
		
		while(itr.hasNext()){
			String key=itr.next();
			System.out.print(key+"="+map.get(key)+" ");
		}
		System.out.println();
		
		System.out.println("map elements::::"+map);
	}
}
