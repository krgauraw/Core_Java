package dev.lara.list;

import java.util.LinkedList;

/**
 * Implement custom queue using LinkedList
 * @author gauraw
 *
 */
class Queue
{
	private LinkedList list=new LinkedList();
	private static  int listSize;
	public void add(Object obj){
		list.add(obj);
		listSize=list.size();
	}
	
	public Object processElement(){
		return list.removeFirst();
	}
	
	public String toString(){
		return list.toString();
	}
	
	public int getSize(){
		return listSize;
	}
}

public class P82 // Impl to demonstrate Custom Queue 
{

	public static void main(String[] args) {
		
		Queue q1=new Queue();
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		q1.add(60);
		q1.add(70);
		q1.add(80);
		
		System.out.println("Custom queue elements::::"+q1);
		for (int i = 0; i < q1.getSize(); i++) {
			System.out.println("Processing queue::::"+q1.processElement()+ " came out");
		}
		
		
	}

}
