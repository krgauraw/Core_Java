package dev.lara.list;

import java.util.ArrayList;

/**
 * Adding elements in middle of a list 
 * @author gauraw
 *
 */
public class P41 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(90);
		list.add(120);
		list.add(200);
		list.add("abc");
		
		System.out.println("Before Adding Element, List::"+list);
		
		list.add(2, "check"); //All elements are right shifted by one.
		
		System.out.println("After adding element at index=2, List::"+list);
		
	}
}
