package dev.lara.mix;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * CopyOnWriteArrayList demo
 * @author gauraw
 *
 */
public class P11 {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
		
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		
		System.out.println("list data:::"+list);
		Iterator<String> itr=list.iterator();
		list.add("end"); // will not cause for java.util.ConcurrentModificationException
		
		while(itr.hasNext()){
			System.out.print(itr.next()+" "); 
		}
		System.out.println();
		
		System.out.println("list data:::"+list);
	}
}
