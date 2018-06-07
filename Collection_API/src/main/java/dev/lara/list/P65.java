package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Finding Min & Max Value in list
 * @author gauraw
 *
 */
public class P65 {

	public static void main(String[] args) {
	
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(9);
		list.add(16);
		list.add(2);
		list.add(7);
		
		System.out.println("list elements::"+list);
		
		System.out.println("Maximum Value in List::::"+Collections.max(list));
		System.out.println("Minimum Value in List::::"+Collections.min(list));
	}

}
