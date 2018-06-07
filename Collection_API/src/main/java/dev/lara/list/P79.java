package dev.lara.list;

import java.util.LinkedList;

/**
 * uses of poll() with LikedList. poll() is from queue. It read head element and then remove the element.
 * poll() can be used to achieve Queue functionality over a LinkedList Object.
 * @author gauraw
 *
 */
public class P79 {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		//Adding Elements
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(5);
		
		System.out.println("LinkedList object elements:::"+list);
		
		System.out.println("Reading using poll():::"+list.poll());
		System.out.println("Reading using poll():::"+list.poll());
		System.out.println("Reading using poll():::"+list.poll());
		
		System.out.println("LinkedList object elements after reading 3 times using poll():::"+list);
		
		
	}

}
