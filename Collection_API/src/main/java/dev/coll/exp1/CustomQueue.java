package dev.coll.exp1;

import java.util.LinkedList;

/**
 * Custom Queue Class.
 * 
 * @author gauraw
 *
 */
public class CustomQueue 
{
	private LinkedList<Object> queue=new LinkedList<Object>();
	
	
	public LinkedList<Object> getQueue() {
		return queue;
	}

	public boolean addElement(Object element)
	{
		return queue.add(element);
	}
	
	public Object processElement()
	{
		return queue.removeFirst();
	}
	
	public String toString()
	{
		return queue.toString();
	}
}
