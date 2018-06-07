package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Sort list element in reverse order using comparator object.
 * Perform binary search operation in reverse order using Comparator Object.
 * @author gauraw
 *
 */
public class P64 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(9);
		list.add(16);
		list.add(2);
		list.add(7);
		
		System.out.println("list elements::"+list);
		
		Collections.sort(list); 
		
		System.out.println("list elements after sorting::"+list);
		
		Comparator ctr=Collections.reverseOrder(); // Comparator Object to sort list in reverse order.
		Collections.sort(list,ctr); // sorting list in reverse order
		
		System.out.println("list elements after sorting in reverse order::"+list);
		
		// binary search - for binary search, elements should be sorted first.
		int i = Collections.binarySearch(list,20,ctr); // If we want to serach in reverse order then we need to pass comparator object
		if(i>=0)
		System.out.println("Elemet found at index "+i);
	}

}
