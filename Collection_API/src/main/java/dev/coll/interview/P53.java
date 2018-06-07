package dev.coll.interview;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * Iterate through the values of LikedHashMap
 * @author gauraw
 *
 */
public class P53 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer,String>();
		map.put(1, "ABC");
		map.put(2, "Hello");
		map.put(3, "Hi");
		map.put(4, "Hey");
		
		System.out.println("LinkedHashMap map elements::::::::::::::"+map);
		
		System.out.print("Iterating map through values:::::::::: ");
		
		Collection coll=map.values();	// will provide all values as Collection. Even List or Set can be used here to hold values.
		
		Iterator itr=coll.iterator();
		
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}
}
