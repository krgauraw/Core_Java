package dev.coll.interview;

import java.util.LinkedList;

/**
 * Add element at first and last of LinkedList
 * @author gauraw
 *
 */
public class P25 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("list:::::"+list);
		list.addFirst(1000);
		list.addLast(2000);
		
		System.out.println("list after adding 1000 at first and 2000 at last:::::::::"+list);
	}
}
