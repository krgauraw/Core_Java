package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Sorting list data in reverse order by passing comparator Object as criteria.
 * @author gauraw
 *
 */
public class P54 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add(20);
		list.add(60);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(40);
		
		System.out.println("Unsorted List:::"+list);
		
		//Comparable ctr=Collections.reverseOrder()
		Comparator ctr=Collections.reverseOrder();	//Creating Criteria for Sorting using Comparator
		Collections.sort(list,ctr);	// sorting using comparator object 
		System.out.println("Sorted List:::sorting done in reverse order using Collections.sort(list, Comparator ctr)::::"+list);
	}

}
