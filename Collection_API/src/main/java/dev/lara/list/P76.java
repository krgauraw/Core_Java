package dev.lara.list;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Modification/Updation of Record while reading elements of list using ListIterator.
 * @author gauraw
 *
 */
public class P76 {

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
		System.out.println("100 is added to the list before start iterating");
		// 100 is added left to the element on which iterator is pointing i.e. 1st element.
		
		//System.out.print("Reading list data in forward direction:: ");
		while(lItr.hasNext()){
			if(lItr.next().equals(16)){
				lItr.set(2000);
				System.out.println("16 is replaced with 2000 while iterating the list.");
			}
		}
		
		System.out.println("list elements after modification::"+list);
	}

}
