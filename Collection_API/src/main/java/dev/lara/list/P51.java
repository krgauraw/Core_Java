package dev.lara.list;

import java.util.ArrayList;

/**
 * Replace any element using set() in list.
 * @author gauraw
 *
 */
public class P51 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("Actual List:::"+list);
		list.set(1, 200); //set() is used to replace existing element. Here 1 is index location
		System.out.println("List after modification using set() at index 1:::"+list);
	}

}
