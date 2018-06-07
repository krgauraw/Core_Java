package dev.lara.list;

import java.util.LinkedList;

/**
 * develop custom stack using LinkedList.
 * @author gauraw
 *
 */

class Stack
{
	private LinkedList list=new LinkedList();
	
	private static  int listSize;
	public void add(Object obj){
		list.add(obj);
		listSize=list.size();
	}
	
	public Object processElement(){
		return list.removeLast();
	}
	
	public String toString(){
		return list.toString();
	}
	
	public int getSize(){
		//return listSize;
		return list.size();
	}

}
public class P83 {

	public static void main(String[] args) {
		
		Stack s1=new Stack();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.add(80);
		
		System.out.println("Custom Stack elements::::"+s1);
		for (int i = 0; i < s1.getSize(); i++) {
			System.out.println("Processing stack::::"+s1.processElement()+ " came out");
		}
	}

}
