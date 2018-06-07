package dev.lara.list;

import java.util.ArrayList;

/**
 * Getting size of list and printing elements though for loop using get()
 * @author gauraw
 *
 */
public class P39 
{
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		
		list.add(90);
		list.add(90.9);
		list.add("Hello");
		list.add(true);
		
		System.out.println("No Of elements inside list::"+list.size()); //size() will return total size of a list.
		
		for (int i = 0; i <list.size(); i++) 
		{
			System.out.print(list.get(i)+" ");
		}
	}
}
