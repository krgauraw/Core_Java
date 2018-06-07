package dev.lara.list;

import java.util.LinkedList;

/**
 * peek() demo over LinkedList Object.
 * peek() method read only head element and not remove anything.
 * @author gauraw
 *
 */
public class P81 {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		//Adding Elements
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(5);
		
		System.out.println("LinkedList object elements:::"+list);
		
		System.out.println("Reading using peek():::"+list.peek());
		System.out.println("Reading using peek():::"+list.peek());
		System.out.println("Reading using peek():::"+list.peek());
		
		System.out.println("LinkedList object elements after reading 3 times using peek():::"+list);
	}

}
