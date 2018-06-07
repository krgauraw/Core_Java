package dev.lara.list;

import java.util.ArrayList;

/**
 * Remove all elements of list2 from list1, if available.
 * @author gauraw
 *
 */
public class P48 
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(9);
		list1.add(0);
		list1.add(4);
		list1.add(6);
		list1.add(8);
		list1.add(2);
		list1.add(1);
		list1.add(3);
		System.out.println("Printing list1 elements::::::"+list1);
		
		ArrayList list2=new ArrayList();
		list2.add(3);
		list2.add(14);
		list2.add(4);
		list2.add(2);
		
		System.out.println("Printing list2 elements:::::::"+list2);
		
		list1.removeAll(list2); //Remove all elements of list2 from list1, if available. Here list2 elements will not modified.
		
		System.out.println("Printing list elements after Removing list2 elements from list1:::::::::");
		System.out.println("list1::"+list1);
		System.out.println("list1::"+list2);
	}
}
