package dev.lara.list;

import java.util.ArrayList;

/**
 * Removing element from list using removeRange().
 * removeRange() is a protected method inside ArrayList. 
 * So we have to inherit ArrayList in order to use it. It will remove from index 0 to 1 if removeRange(0,2) will be called . 
 * toIndex will be excluded.
 * @author gauraw
 *
 */
public class P50 extends ArrayList
{
	public static void main(String[] args) {
		
		P50 list=new P50();
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(7);
		
		System.out.println("Printing list elements::::"+list);
		
		list.removeRange(0, 2); //removeRange() is a protected method inside ArrayList. So we have to inherit ArrayList in order to use it. It will remove from index 0 to 1. toIndex will be excluded.
		
		System.out.println("Printing list after removing elements using removeRange(0,2):::::::::"+list);
	}

}
