package dev.lara.list;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Adding element in a list while iterating using ListIterator Object
 * @author gauraw
 *
 */
public class P75 {

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
		
		lItr.add(100); // This is allowd because we are adding element using add() of ListIterator and not ArrayList.
		
		// 100 is added left to the element on which iterator is pointing i.e. 1st element.
		
		System.out.print("Reading list data in forward direction:: ");
		while(lItr.hasNext()){
			System.out.print(lItr.next()+" ");	
			//lItr.add(3000);	// we can add here also
		}
		System.out.println();
		
		System.out.println("list elements after modification::"+list);
	}

}
