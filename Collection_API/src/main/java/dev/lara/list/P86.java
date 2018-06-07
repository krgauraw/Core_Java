package dev.lara.list;

import java.util.PriorityQueue;

/**
 * PriorityQueue demo. can't add null value to queue.
 * @author gauraw
 *
 */
public class P86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(null); //java.lang.NullPointerException will be thrown. can't add null .
		pq.add(20);
		
		System.out.println("PriorityQueue object pq elements::::"+pq);
	}

}
