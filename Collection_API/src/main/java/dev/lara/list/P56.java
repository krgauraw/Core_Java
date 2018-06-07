package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * sort list data having String value using Collections.sort().
 * @author gauraw
 *
 */
public class P56 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add("ABC");
		list.add("aBC");
		list.add("AbC");
		list.add("123");
		list.add("ABc");
		list.add("aBc");
		list.add("abc");
		
		System.out.println("Actual list without sorting:::::"+list);
		//String class already implements Comparable Interface. So sorting operation is successful.
		Collections.sort(list);
		System.out.println("Sorted List:::sorting done using Collections.sort(list)::::"+list);
		
	}

}
