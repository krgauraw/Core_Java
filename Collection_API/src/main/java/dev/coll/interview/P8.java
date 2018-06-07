package dev.coll.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * get synchronized list from ArrayList
 * @author gauraw
 *
 */
public class P8 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		List syncList=Collections.synchronizedList(list);
		
		System.out.println("Synchronized list:::"+syncList);
	}
}
