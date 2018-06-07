package dev.lara.list;

import java.util.LinkedList;

/**
 * Remove element from LinkedList object.
 * By using removeLast(),  we can implement Stack functionality.
 * @author gauraw
 *
 */
public class P80 {

	public static void main(String[] args) {
	
		LinkedList list=new LinkedList();
		//Adding Elements
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(5);
		list.addFirst(1000);
		list.addLast(2000);
		
		System.out.println("LinkedList object elements:::"+list);
		
		list.remove(5);	// Index location 5 is removed
		System.out.println("5 is Removed from the list");
		
		list.remove(2);
		System.out.println("Element at index location 2 is removed.");
		
		list.removeFirst();
		System.out.println("First Element Removed.");
		
		list.removeLast();
		System.out.println("Last Element Removed.");
		
		System.out.println("LinkedList object elements:::"+list);
	}

}
