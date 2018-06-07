package dev.coll.interview;

import java.util.LinkedList;

/**
 * Remove elements from LinkedList 
 * @author gauraw
 *
 */
public class P26 {

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
		
		
		System.out.println("Is 50 removed from list?????  "+list.remove(new Integer(50)));
		System.out.println("list:::::"+list);
		
		System.out.println("Is element removed at index 1 from list?????  "+list.remove(1));
		System.out.println("list:::::"+list);
		
		System.out.println("Is 90 removed from list?????  "+list.remove(new Integer(90)));
		System.out.println("list:::::"+list);
		
		System.out.println("Is First Record removed from list?????  "+list.removeFirst());
		System.out.println("list:::::"+list);
		
		System.out.println("Is Last Record removed from list?????  "+list.removeLast());
		System.out.println("list:::::"+list);
	}
}
