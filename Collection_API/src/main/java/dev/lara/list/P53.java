package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Sorting of List using Collections.sort(list).
 * @author gauraw
 *
 */
public class P53 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add(20);
		list.add(60);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(40);
		
		System.out.println("Unsorted List:::"+list);
		//All wrapper classes are subclass to Comparable Interface
		Collections.sort(list); // sort() sort the elements internally using Bubble sort. For sorting, list must have elements of single data type
		System.out.println("Sorted List:::sorting done using Collections.sort(list)::::"+list);
	}

}
