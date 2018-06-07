package dev.lara.list;

import java.util.ArrayList;

/**
 * Remove All Record from a List
 * @author gauraw
 *
 */
public class P47 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);
		System.out.println("Printing before removing all elements:::::::"+list);
		
		list.clear();
		
		System.out.println("Printing after removing all elements:::::::"+list);
	}

}
