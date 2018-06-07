package dev.lara.set;

import java.util.TreeSet;

/**
 * TreeSet demo. Adding element to TreeSet.
 * @author gauraw
 *
 */
public class P101 {

	public static void main(String[] args) {
		
		TreeSet tSet=new TreeSet();
		tSet.add("hello");
		tSet.add("abc");
		tSet.add("test");
		tSet.add("done");
		tSet.add("check");
		
		System.out.println("TreeSet Object tSet element:::"+tSet); //Elements are automatically sorted. 
		
	}

}
