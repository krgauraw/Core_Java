package dev.lara.list;

import java.util.ArrayList;

/**
 * Printing ArrayList in different way.
 * @author gauraw
 *
 */
public class P40 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(90);
		list.add(90.9);
		list.add("hello");
		list.add(true);
		
		//Printing directly using sysout
		System.out.println("List::"+list);	//toString() is overrided in ArrayList
		
		System.out.println("----------------");
		
		//Printing using for loop
		for (int i = 0; i <list.size(); i++) 
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println("");
		System.out.println("----------------");
		
		//Printing using enhanced for loop
		for (Object obj:list) 
		{
			System.out.print(obj+" ");
		}
	}
}
