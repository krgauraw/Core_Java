package dev.coll.interview;

import java.util.ArrayList;

/**
 * Adding element in the list at any specified location.
 * Auto shifting will happen in case of ArrayList.
 * @author gauraw
 *
 */
public class P17 {

	public static void main(String[] args) {
		
ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(90);
		list.add(20);
		list.add(40);
		list.add(8);
		list.add(50);
		System.out.println("list::::"+list);
		System.out.println("list size::::"+list.size());
		
		list.add(1,400); //element will be right shifted by one element.
		list.add(2, 800);
		
		System.out.println("list after adding elements at index 1 & 2::::"+list);
		System.out.println("list size after add::::"+list.size());
	}
}
