package dev.coll.interview;

import java.util.LinkedList;

/**
 * Retrieving 	ends from LinkedList i.e first and last elements
 * @author gauraw
 *
 */
public class P27 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.addFirst(1000);
		list.addLast(2000);
		System.out.println("list:::::"+list);
		
		//Reteriving ends i.e. first and last element
		System.out.println("Ends of list:: "+list.getFirst()+" & "+list.getLast());
	}
}
