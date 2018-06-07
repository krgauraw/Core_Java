package dev.coll.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * Get Enumeration over ArrayList. Enumeration<Integer> e=Collections.enumeration(list); is used 
 * @author gauraw
 *
 */
public class P13 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(90);
		list.add(20);
		list.add(40);
		list.add(8);
		list.add(50);
		System.out.println("list::::"+list);
		
		//creating Enumeration object
		Enumeration<Integer> e=Collections.enumeration(list);
		
		System.out.print("Reading list through Enumeration object:::::: ");
		while (e.hasMoreElements()) {
			//Integer integer = (//Integer) e.nextElement();
			
			System.out.print(e.nextElement()+" ");
		}
	}
}
