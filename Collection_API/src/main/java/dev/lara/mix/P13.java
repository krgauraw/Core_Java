package dev.lara.mix;

import java.util.ArrayDeque;

/**
 * ArrayDeque demo
 * @author gauraw
 *
 */
public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> ad=new ArrayDeque<String>();
		
		ad.add("hello");
		ad.add("hi");
		ad.addFirst("first");
		ad.addLast("last");
		
		System.out.println("ArrayDeque object ad elements::::"+ad);
	}

}
