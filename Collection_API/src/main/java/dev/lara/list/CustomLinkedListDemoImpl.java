package dev.lara.list;

import java.util.Iterator;

/**
 * @author gauraw
 *
 */
public class CustomLinkedListDemoImpl {
	public static void main(String[] args) {
		
		CustomLinkedList list=new CustomLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//System.out.println("list elements::::"+list);
		
		list.iterate();
	}
}
