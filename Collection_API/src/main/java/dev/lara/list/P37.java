package dev.lara.list;

import java.util.ArrayList;

/**
 * Adding elements to the list and Printing through sysout.
 * @author gauraw
 *
 */
public class P37 
{
	public static void main(String[] args) 
	{
		ArrayList list =new ArrayList();
		
		list.add(90);
		list.add(9.9);
		list.add("abc");
		list.add(true);
		
		//In ArrayList Class toString() is overrided.
		System.out.println("List::"+list);
	}
}
