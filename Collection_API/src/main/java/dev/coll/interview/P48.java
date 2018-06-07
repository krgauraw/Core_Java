package dev.coll.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * get synchronized map from HashMap
 * @author gauraw
 *
 */
public class P48 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		Map<Integer, String> syncMap=Collections.synchronizedMap(map);
		
		System.out.println("syncMap:::::::::::"+syncMap);
	}
}
