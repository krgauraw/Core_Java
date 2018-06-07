package dev.coll.interview;

import java.util.ArrayList;

/**
 * Adding boolean value to list and then retrieved the same
 * @author gauraw
 *
 */
public class P15 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> list=new ArrayList<Boolean>();
		list.add(true);
		list.add(false);
		System.out.println("list::::"+list);
		System.out.println("list.get(0):::::::::::"+list.get(0));
	}
}
