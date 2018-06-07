package dev.lara.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Simple LinkedList Program.
 * @author gauraw
 *
 */
public class P124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list =new LinkedList();
		
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(70);
		list.add(60);
		list.add(80);
		System.out.println("LinkedList element::::"+list);
		Iterator itr=list.iterator();
		System.out.println("Reading though iterator object:::");
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}

}
