package dev.coll.interview;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Perform binary search over ArrayList.
 * In order to perform binary search, list should be sorted first.
 * Collections.binarySearch() will be used.
 * @author gauraw
 *
 */
public class P14 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(90);
		list.add(20);
		list.add(40);
		list.add(8);
		list.add(50);
		System.out.println("Unsorted list::::"+list);
		
		Collections.sort(list);
		
		System.out.println("Sorted list:::::"+list);
		
		int index=Collections.binarySearch(list, 40);
		
		System.out.println("Element found at index::::"+index);
	}
}
