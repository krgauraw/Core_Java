package dev.lara.list;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Fail Fast behavior demo of ListIterator
 * By default, every Iterator is Fail Fast Iterator.
 * @author gauraw
 *
 */
public class P73 {

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
		
		ListIterator lItr=list.listIterator();
		
		list.add(100); // Concurrent Modification not allowed. R.T.E will come
		
		System.out.print("Reading list data in forward direction:: ");
		while(lItr.hasNext()){
			System.out.print(lItr.next()+" ");	// R.T.Exception will be raised at this line. java.util.ConcurrentModificationException
		}
		System.out.println();
	}

}
