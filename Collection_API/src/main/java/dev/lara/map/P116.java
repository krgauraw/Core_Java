package dev.lara.map;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Creating TreeMap Object using HashMap Object to achieve Sorting on Key.
 * @author gauraw
 *
 */
public class P116 
{
	public static void main(String[] args) {
		HashMap hMap =new HashMap();
		
		hMap.put("key", 100);
		hMap.put("abc", 200);
		hMap.put("hello", 300);
		hMap.put("done", 400);
		hMap.put("test", 500);
		hMap.put("java", 600);
		
		System.out.println("Printing HashMap Object:::::hMap::::"+hMap);
		System.out.println("-----------------------------------------------------");
		
		TreeMap tMap=new TreeMap(hMap);	//sorting is done on key. Character based shorting is done.
		System.out.println("Printing TreeMap Object tMap Created using above HashMap Object:::::tMap:::"+tMap);
		
		
	}
}
