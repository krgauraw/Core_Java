package dev.lara.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Read values from list using Iterator & ListIterator. Iterator is an interface
 * which contains hasNext(), next() & remove(). we can iterate the elements of
 * ArrayList through iterator. hasNext() returns true if element is found
 * otherwise false. next() is used to read current element In Iterator, cursor
 * moves from left to right. Once cursor reached to right most element, we can't
 * read again using the same Iterator Object. There is no way to read in reverse
 * direction using Iterator once cursor start moving.
 * 
 * @author gauraw
 *
 */
public class P66 {

	public static void main(String[] args) throws InterruptedException {

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(9);
		list.add(16);
		list.add(2);
		list.add(7);

		System.out.println("list elements::" + list);

		Iterator itr = list.iterator();
		System.out.println("Reading through iteraor::");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		ListIterator lItr = list.listIterator();
		System.out.println("Reading through list iterator::::");
		while (lItr.hasNext()) {
			System.out.println(lItr.next() + " ");
		}
	}

}
