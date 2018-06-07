package dev.lara.list;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * PriorityQueue Demo.
 * @author gauraw
 *
 */
class M
{
	int i,j;
	M(int i, int j){
		this.i=i;
		this.j=j;
	}
	
	public String toString(){
		return "i="+i+",j="+j;
	}
}

class N implements Comparator
{
	//@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((M)o1).i-((M)o2).i;		// based on i value		(comparing)
	}
}

class O implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((M)o1).j-((M)o2).j;		// based on j value		(comparing)
	}
}


public class P88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q1=new PriorityQueue(10,new N()); // Initial capacity : 10. new N() : seperate comparator object is supplied to sort based on i value.
		
		q1.add(new M(1,2));
		q1.add(new M(0,1));
		q1.add(new M(5,10));
		q1.add(new M(3,5));
		q1.add(new M(2,0));
		
		System.out.println("PriorityQueue object q1 elements::::"+q1);
		System.out.println("Calling q1.poll()::::"+q1.poll());
		System.out.println("Calling q1.poll()::::"+q1.poll());
		System.out.println("Calling q1.poll()::::"+q1.poll());
		System.out.println("PriorityQueue object q1 elements after q1.poll() call 3 times::::"+q1);
		
		PriorityQueue q2=new PriorityQueue(10, new O());
		
		q2.add(new M(1,2));
		q2.add(new M(0,1));
		q2.add(new M(5,10));
		q2.add(new M(3,5));
		q2.add(new M(2,0));
		
		System.out.println("PriorityQueue object q2 elements::::"+q2);
		System.out.println("Calling q2.poll()::::"+q2.poll());
		System.out.println("Calling q2.poll()::::"+q2.poll());
		System.out.println("Calling q2.poll()::::"+q2.poll());
		System.out.println("PriorityQueue object q2 elements after q2.poll() call 3 times::::"+q2);
		
		
	}

}
