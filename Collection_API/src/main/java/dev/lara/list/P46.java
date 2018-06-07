package dev.lara.list;

import java.util.ArrayList;

/**
 * Remove element from a list using remove(). Return type of remove() is boolean.
 * @author gauraw
 *
 */
public class P46
{
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);
		System.out.println(list);
		boolean flag=list.remove(new Integer(2));
		System.out.println(list);
		System.out.println(flag);
		flag=list.remove(new Integer(12));
		System.out.println(flag);
		
		
		
	}

}
