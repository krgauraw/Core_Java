package dev.lara.list;

import java.util.ArrayList;

/**
 * Pass the entire list as an argument while creating another list.
 * Here list1 is passed to list2 as initial data.
 * @author gauraw
 *
 */
public class P44 
{
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		ArrayList list2=new ArrayList(list1); // list2 is created with initial element as list1
		
		System.out.println("List 2:::"+list2);
		
	}
}
