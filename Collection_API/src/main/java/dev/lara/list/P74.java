package dev.lara.list;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Adding element to the list after finish iteration using ListIterator
 * @author gauraw
 *
 */
public class P74 {

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
		
		System.out.print("Reading list data in forward direction:: ");
		while(lItr.hasNext()){
			System.out.print(lItr.next()+" ");	
		}
		System.out.println();
		
		list.add(100); // Allowed. It is not Concurrent Modification
		
		System.out.println("list elements after modification::"+list);
	}

}
