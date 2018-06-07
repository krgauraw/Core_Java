package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Perform binary search operation over a list.
 * 
 * @author gauraw
 *
 */
public class P63 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("red");
		list.add("blue");
		list.add("yello");
		list.add("indigo");
		list.add("green");

		System.out.println("list elements::" + list);

		Collections.sort(list); // All are String Objects. So Sorting is successful.

		System.out.println("list elements after sorting::" + list);

		// binary search - for binary search, elements should be sorted first.
		//int i = Collections.binarySearch(list, "voilet"); //if element not found, then -ve value will come
		int i = Collections.binarySearch(list, "red");
		if (i >= 0)
			System.out.println("Element found at index " + i);
	}

}
