package dev.lara.list;

import java.util.ArrayList;

/**
 * Check whether the element present in list or not using contains() .
 * @author gauraw
 *
 */
public class P52 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("Actual List:::"+list);
		//contains(Object o) checks whether element is available in list or not. returns true if exist otherwise false.
		System.out.println("List contains 20????::::::::"+list.contains(20));
		System.out.println("List contains 90????::::::::"+list.contains(90));
	}

}
