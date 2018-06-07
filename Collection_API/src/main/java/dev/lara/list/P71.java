package dev.lara.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Adding element in a list after iterate using Iterator Object.
 * We can add element to the list, once iterator object finished reading.
 * @author gauraw
 *
 */
public class P71 {

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
		System.out.print("Reading through Iterator::: ");
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		list.add(100); // Allowed. It is not concurrent operation. 
		System.out.println("list after modification:::"+list);
	}

}
