package dev.coll.interview;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Append all elements of other collection to ArrayList
 * @author gauraw
 *
 */
public class P19 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		
		System.out.println("list:::"+list);
		
		Vector<String> v=new Vector<String>();
		v.add("4");
		v.add("5");
		System.out.println("Vector v::::::::"+v);
		
		//appending Vector elements to ArrayList object list
		list.addAll(v);
		
		System.out.println("list after appending v elements::::"+list);
	}
}
