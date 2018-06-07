package dev.coll.interview;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Copy one arrayList to another arrayList
 * @author gauraw
 *
 */
public class P10 {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		
		System.out.println("list1:::::::::"+list1);
		
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		list2.add("five");
		list2.add("six");
		
		System.out.println("list2:::::::::"+list2);
		
		Collections.copy(list2, list1); // copying list1 to list2
		
		System.out.println("after copying list1 to list2, list2 elements::::"+list2);
	}
}
