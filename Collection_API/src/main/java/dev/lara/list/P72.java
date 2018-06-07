package dev.lara.list;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Reading list data in forward as well as reverse direction using ListIterator Object
 * @author gauraw
 *
 */
public class P72 {

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
		
		
		System.out.print("Reading list data in reverse direction:: ");
		while(lItr.hasPrevious()){
			System.out.print(lItr.previous()+" ");
		}
		System.out.println();
		
		System.out.print("Reading list data again in forward direction:: ");
		while(lItr.hasNext()){
			System.out.print(lItr.next()+" ");
		}
		System.out.println();
	}

}
