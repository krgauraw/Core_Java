package dev.lara.list;

import java.util.PriorityQueue;

/**
 * PriorityQueue demo. Problem while adding different types of data to same object.
 * @author gauraw
 *
 */
public class P85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq=new PriorityQueue(); // auto sorting performed. Internally uses compareTo() to perform sorting
		
		pq.add(20);
		pq.add("hello");	//ClassCastException will be raised at this line. All elements should be of same type to perform sorting.
		pq.add(true);
		pq.add(30);
		pq.add(40.5);
		
		System.out.println("PriorityQueue object pq elements::::"+pq);
	}

}
