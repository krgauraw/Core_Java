package dev.coll.interview;

import java.util.ArrayList;
import java.util.Collections;

/**
 * sort element of an arrayList
 * @author gauraw
 *
 */
public class P7 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(4);
		list.add(6);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(2);
		
		System.out.println("Unsorted list :::::"+list);
		
		Collections.sort(list);
		
		System.out.println("After sorting, list data:::::"+list);
	}
}
