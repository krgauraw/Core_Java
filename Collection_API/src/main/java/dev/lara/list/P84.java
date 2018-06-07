package dev.lara.list;

import java.util.PriorityQueue;

/**
 * PriorityQueue demo. insert, poll() and peek() demo.
 * 
 * @author gauraw
 *
 */
public class P84 {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue(); // auto sorting performed. Internally uses compareTo() to perform sorting
		
		pq.add(20);
		pq.add(10);
		pq.add(50);
		pq.add(30);
		pq.add(40);
		pq.add(80);
		pq.add(60);
		pq.add(70);
		
		
		System.out.println("PriorityQueue object pq elements::::"+pq);
		System.out.println("Calling pq.poll()::::"+pq.poll());
		System.out.println("Calling pq.poll()::::"+pq.poll());
		System.out.println("Calling pq.poll()::::"+pq.poll());
		System.out.println("PriorityQueue object pq elements after pq.poll() call 3 times::::"+pq);
		System.out.println("Calling pq.peek()::::"+pq.peek());
		System.out.println("Calling pq.peek()::::"+pq.peek());
		System.out.println("Calling pq.peek()::::"+pq.peek());
		System.out.println("PriorityQueue object pq elements after pq.peek() call 3 times::::"+pq);
		
	}

}
