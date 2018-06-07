package dev.lara.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Reading,Printing & Removing the element at the same time using Iterator Object 
 * @author gauraw
 *
 */
public class P68 {

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
		System.out.println("Reading through iteraor and removing element::");
		while(itr.hasNext()){
			System.out.print(itr.next()+ " ");
			itr.remove(); // Removing Element
		}
		System.out.println();
		
		System.out.println("List Size after iterate & remove:::"+list.size());
	}

}
