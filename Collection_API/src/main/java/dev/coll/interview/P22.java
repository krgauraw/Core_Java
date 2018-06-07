package dev.coll.interview;

import java.util.LinkedList;

/**
 * get elements from LinkedList
 * @author gauraw
 *
 */
public class P22 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.print("Reading LinkedList through for loop::::");
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
	}
}
