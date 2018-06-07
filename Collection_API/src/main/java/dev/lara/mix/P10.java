package dev.lara.mix;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * ConcurrentModificationException demonstration over a map.
 * @author gauraw
 *
 */
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		map.put("key1", 20);
		map.put("key2", 30);
		map.put("key3", 40);
		map.put("key4", 50);
		
		Set<String> set=map.keySet(); // keySet() will return all key present inside the map.
		Iterator<String> itr=set.iterator(); // iterator() method can be called only over list or set but not over map.
		
		map.put("key5", 60); // this line of code is causing java.util.ConcurrentModificationException
		
		//Iterating over keys
		while(itr.hasNext()){
			System.out.print(itr.next()+" "); //exception will be thrown from this line.
		}
		
	}

}
