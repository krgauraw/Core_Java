package dev.coll.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * convert a list into set
 * @author gauraw
 *
 */
public class P29 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
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
