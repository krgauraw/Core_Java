package dev.lara.list;

import java.util.ArrayList;

/**
 * Adding a entire list to another list at specified index location. 
 * @author gauraw
 *
 */
public class P43 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		for (int i = 10; i <=100; i+=10) 
		{
			list1.add(i);
		}
		
		System.out.println("List 1::"+list1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>() ;
		list2.add(110);
		list2.add(120);
		//list2.addAll(list1);	//Adding all elements of list to list1 at once
		list2.addAll(1,list1);
		System.out.println("List 2::"+list2);
	}
}
