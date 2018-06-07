package dev.lara.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Fail Fast Behavior demo of Iterator
 * Iterator is Fail Fast Iterator. So Concurrent modification is not allowed.
 * we can't add elements while iterating or before iterating list, once Object of Iterator got created.
 * @author gauraw
 *
 */
public class P70 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(9);
		list.add(16);
		list.add(2);
		list.add(7);
		
		System.out.println("list elements::"+list);
		
		Iterator itr=list.iterator(); // Iterator Object created for list.
		
		list.add(100); // Not allowed . java.util.ConcurrentModificationException will come. Run Time Exception
		
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}
		
		System.out.println("list after modification:::"+list);
	}

}
