package dev.lara.mix;

import java.util.ArrayDeque;

/**
 * ArrayDeque demo
 * @author gauraw
 *
 */
public class P14 {
	public static void main(String[] args) {
		
		ArrayDeque<String> ad=new ArrayDeque<String>();
		
		ad.add("hello");
		ad.add("hi");
		ad.addFirst("first");
		ad.addLast("last");
		
		System.out.println("ArrayDeque object ad elements::::"+ad);
		System.out.println("ad.pollFirst():::::::::"+ad.pollFirst());
		System.out.println("ArrayDeque object ad elements::::"+ad);
		System.out.println("ad.pollLast()::::::::"+ad.pollLast());
		System.out.println("ArrayDeque object ad elements::::"+ad);
	}
}
