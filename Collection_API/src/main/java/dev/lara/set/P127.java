package dev.lara.set;

import java.util.TreeSet;

/**
 * some functions like ceiling(),floor() demo with set. 
 * Look Inside code.
 * @author gauraw
 *
 */
public class P127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set=new TreeSet();
		set.add(50);
		set.add(5);
		set.add(10);
		set.add(15);
		set.add(30);
		set.add(35);
		set.add(25);
		set.add(40);
		set.add(38);
		set.add(20);
		
		System.out.println("TreeSet Object set element:::"+set);
		
		System.out.println("set.ceiling(13)::::"+set.ceiling(13));
		System.out.println("set.floor(13)::::::"+set.floor(13));
		
		System.out.println("set.ceiling(15)::::"+set.ceiling(15));
		System.out.println("set.floor(15)::::::"+set.floor(15));
		
		System.out.println("set.headSet(22):::::"+set.headSet(22));
		System.out.println("set.headSet(25):::::"+set.headSet(25));
		
		System.out.println("set.headSet(25, true):::::::::"+set.headSet(25, true));
		System.out.println("set.headSet(25, false)::::::::"+set.headSet(25, false));
		
		System.out.println("set.tailSet(30):::::::"+set.tailSet(30));
		System.out.println("set.tailSet(30, false):::::::"+set.tailSet(30, false));
		
		System.out.println("set.higher(33)::::::"+set.higher(33));
	}

}
