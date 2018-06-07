package dev.lara.map;

import java.util.HashMap;

/**
 * adding value to duplicate key.
 * 
 * @author gauraw
 *
 */
public class P110 {

		public static void main(String[] args) {
			
			HashMap map=new HashMap();
			
			map.put(null, null);
			map.put(null, "ABC");	//replaced
			map.put(null, null);	//replaced
			map.put(null, "xyz");	//replaced
			
			//last value is reflected
			System.out.println("Printing Map Object::::map::::"+map);
			
		}
}
