package dev.lara.list;

import java.util.PriorityQueue;

/**
 * Adding custom class object to PriorityQueue object.
 * @author gauraw
 *
 */

class L implements Comparable
{
	int i;
	L(int i){
		this.i=i;
	}
	
	//@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		return i-((L)obj).i;
	}
	
	public String toString(){
		return Integer.toString(i); //call to toString() of Integer class.
	}
	
}

public class P87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		
		pq.add(new L(10));	// All are of same type. so sorting successful.
		pq.add(new L(20));
		pq.add(new L(80));
		pq.add(new L(50));
		pq.add(new L(60));
		pq.add(new L(30));
		
		System.out.println("PriorityQueue object pq elements::::"+pq);
		System.out.println("Calling pq.poll()::::"+pq.poll());
		System.out.println("Calling pq.poll()::::"+pq.poll());
		System.out.println("Calling pq.poll()::::"+pq.poll());
		System.out.println("PriorityQueue object pq elements after pq.poll() call 3 times::::"+pq);
	}

}
