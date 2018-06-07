package dev.lara.list;

import java.util.ArrayList;

/**
 * Casting element to their corresponding type while retrieving from list.
 * @author gauraw
 *
 */
public class P38 
{
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		
		list.add(90);
		list.add(true);
		
		int i = (Integer)list.get(0); //returns Integer object in the form of Object Type. So It must be down casted. 
		boolean b=(Boolean)list.get(1); //If down casting is not proper. It will throw ClassCastException.
		
		System.out.println("i="+i);
		System.out.println("b="+b);
	}
}
