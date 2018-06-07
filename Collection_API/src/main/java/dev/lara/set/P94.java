package dev.lara.set;

import java.util.HashSet;

/**
 * @author gauraw
 *
 */
public class P94 {

	public static void main(String[] args) {
		
		HashSet set1=new HashSet();	//Holding String Object. will hold only one element.
		set1.add("abc");
		set1.add("abc");
		System.out.println("set1 elements holding String Object:::"+set1);
		
		HashSet set2=new HashSet(); //Holding Integer Object. will hold only one element.
		set2.add(10);
		set2.add(10);
		System.out.println("set2 elements holding Integer Object:::"+set2);
		
		HashSet set3=new HashSet(); //Holding Boolean Object. will hold only one element.
		set3.add(true);
		set3.add(true);
		System.out.println("set3 elements holding Boolean Object:::"+set3);
		
		HashSet set4=new HashSet(); //Holding StringBuffer Object. will hold two element. 
		// hasCode() and equals() both are not overrided in StringBuffer class. So HashSet is unable to check for duplicates.
		set4.add(new StringBuffer("abc"));
		set4.add(new StringBuffer("abc"));
		System.out.println("set4 elements holding StringBuffer Object:::"+set4);
		
	}

}
