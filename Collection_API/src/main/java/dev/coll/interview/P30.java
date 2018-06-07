package dev.coll.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Conver an ArrayList to HashSet. Same has been done in P29. 
 * @author gauraw
 *
 */
public class P30 
{
	// Refer to P29. - same code is copied here.
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>(); // ArrayList has been used as reference type here instead of List
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("list:::::::::"+list);
		
		Set<Integer> set=new HashSet<Integer>(list);	// creating HashSet object using list as initial element 
													// HashSet maintains no order. so sequence of element may be changed.
		
		//Reading set through loop.
		System.out.print("set:::::::::: ");
		for(int i:set){
			System.out.print(i+" ");
		}
	}
}
