package dev.lara.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * check the element while iterating and remove from list
 * @author gauraw
 *
 */
public class P69 {

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
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()){
			if(itr.next().equals(9)){
				itr.remove(); // Removing Element
			}
		}
		System.out.println("list elements after Removing 9::::"+list);
		
		System.out.println("List Size after iterate & remove:::"+list.size());
	}

}
