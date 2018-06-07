package dev.lara.list;

import java.util.ArrayList;

/**
 * Remove element from list using remove().
 * 
 * @author gauraw
 *
 */
public class P45 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);

		System.out.println(list);

		Object obj = list.remove(3); //element on index location 3 will be removed.

		System.out.println(list);
		System.out.println(obj);

		obj = list.remove(new Integer(9));
		//obj=list.remove(10);
		System.out.println(obj);

	}

}
