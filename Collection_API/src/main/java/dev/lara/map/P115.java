package dev.lara.map;

import java.util.HashMap;

/**
 * Look into code.
 * @author gauraw
 *
 */

class P
{
	int i;
	
	P(int i){
		this.i=i;
	}
	
	public String toString(){
		return "(i="+i+")";
	}
}

class Q
{
	int i;
	
	Q(int i){
		this.i=i;
	}
	
	public String toString(){
		return "(i="+i+")";
	}
	
	public int hashCode(){
		return Integer.toString(i).hashCode();
	}
	
	public boolean equals(Object obj){
		return (obj instanceof Q && i==((Q)obj).i);
	}
}

//Impl Class
public class P115 {
	 
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		map.put(90, "e1");
		map.put(90, "e2");	// value e1 is replaced by e2
		map.put("abc", "v1");	//replaced by v2
		map.put("abc", "v2");	//replaced by hello4
		
		map.put(new P(9), "hello1");
		map.put(new P(9), "hello2");
		map.put(new Q(9), "hello3");
		map.put(new Q(9), "hello4");
		
		map.put(new StringBuffer("abc"), "hello4");
		map.put(new StringBuffer("abc"), "hello5");	//hello4 is replaced even if providing new object as key
		
		System.out.println(map);
		
	}

}
