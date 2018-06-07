package dev.coll.interview;

import java.util.LinkedList;

/**
 * Get First & Last Element from LinkedList
 * @author gauraw
 *
 */
public class P21 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("list:::::"+list);
		
		System.out.println("First Element of LinkedList list::::"+list.getFirst());
		System.out.println("Last Element of LinkedList list::::"+list.getLast());
	}
}
