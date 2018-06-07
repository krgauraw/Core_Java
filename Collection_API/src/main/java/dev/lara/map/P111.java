package dev.lara.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Read Map Element using keySet() and iterator. Iterate over key
 * Map can be iterated through Iterator Object and keySet().
 * @author gauraw
 *
 */
public class P111 {

	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		
		map.put(1, "A100");
		map.put(2, "A200");
		map.put(3, "A300");
		map.put(4, "A400");
		
		//getting list of all key. keySet() will return Set Object having all key
		Set keySet=map.keySet();
		
		//Creating iterator object on Set Object because iterator can't be applied on Map Object.
		Iterator itr=keySet.iterator();
		
		Object key,value;
		
		//Reading through Iterator Object
		while (itr.hasNext()) {

			key=itr.next();
			value=map.get(key);
			
			System.out.println("Key=="+key+", Value=="+value);
			
		}
	}
}
