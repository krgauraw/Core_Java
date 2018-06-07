package dev.lara.mix;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Reading list data using iterator and demonstration for java.util.ConcurrentModificationException
 * @author gauraw
 *
 */
public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		
		Iterator<String> itr=list.iterator();
		list.add("end"); // cause for java.util.ConcurrentModificationException
		
		while(itr.hasNext()){
			System.out.print(itr.next()+" "); //java.util.ConcurrentModificationException will be thrown from this line.
		}
	}

}
