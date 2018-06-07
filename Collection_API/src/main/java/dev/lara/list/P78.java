package dev.lara.list;

import java.util.LinkedList;

/**
 * LinkedList demo. Insert & Read using get().
 * Insertion order is preserved.
 * @author gauraw
 *
 */
public class P78 {

	public static void main(String[] args) {
	
		LinkedList list=new LinkedList();
		//Adding Elements
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(5);
		
		System.out.println("LinkedList object elements:::"+list);
		System.out.println("Reading using get() for index 2::"+list.get(2));
		System.out.println("Reading using get() for index 0::"+list.get(0));
		System.out.println("Reading using get() for index 1::"+list.get(1));
		
		//Adding at first & last node.
		list.addFirst(1000);
		list.addLast(2000);
		
		System.out.println("LinkedList object elements after adding at first & last node:::"+list);
		
		System.out.println("Reading first element::"+list.getFirst());
		System.out.println("Reading last element::"+list.getLast());
	}

}
