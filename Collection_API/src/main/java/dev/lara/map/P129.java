package dev.lara.map;

import java.util.HashMap;

/**
 * Not Sure.
 * @author gauraw
 *
 */
public class P129 
{
	private HashMap map=new HashMap();
	
	public void set(Object obj){
		
		Thread t=Thread.currentThread();
		long id=t.getId();
		map.put(id, obj);
	}
	
	public Object get(){
		Thread t=Thread.currentThread();
		long id=t.getId();
		return map.get(id);
	}

}
