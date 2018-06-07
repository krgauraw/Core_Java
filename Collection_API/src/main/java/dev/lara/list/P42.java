package dev.lara.list;

import java.util.ArrayList;

/**
 * Adding entire list into another list
 * @param args
 */
public class P42 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 10; i <=100; i+=10) 
		{
			list.add(i);
		}
		
		System.out.println("List 1::"+list);
		
		ArrayList<Integer> list1=new ArrayList<Integer>() ;
		list1.add(110);
		list1.add(120);
		list1.addAll(list);	//Adding all elements of list to list1 at once
		//list1.addAll(1,list);
		System.out.println("List 2::"+list1);
		
		
		
	}
}
