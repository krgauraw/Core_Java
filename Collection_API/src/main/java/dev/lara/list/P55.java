package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * sort list data using Collections.sort().
 * @author gauraw
 *
 */
public class P55 
{
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add(20);
		list.add(60);
		list.add(10);
		list.add(50);
		//list.add("Hello");
		list.add(90.77); //Double Object
		
		System.out.println("Unsorted List:::"+list);
		
		Collections.sort(list); // Here sorting not possible beacuse of different type in the list. java.lang.ClassCastException will come
		
		/*Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		at java.lang.String.compareTo(Unknown Source)
		at java.util.ComparableTimSort.binarySort(Unknown Source)
		at java.util.ComparableTimSort.sort(Unknown Source)
		at java.util.ComparableTimSort.sort(Unknown Source)
		at java.util.Arrays.sort(Unknown Source)
		at java.util.Collections.sort(Unknown Source)
		at dev.lara.arrayList.P55.main(P55.java:24)*/
	}
}
