package dev.coll.interview;

import java.util.LinkedList;
import java.util.List;

/**
 * Get Sublist from LinkedList
 * @author gauraw
 *
 */
public class P23 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("LinkedList list:::::::::"+list);
		
		List subList=list.subList(1, 3); // Here index 3 will be excluded
		
		System.out.println("LinkedList subList index 1 to 3:::::::::"+subList);
		
	}
}
