package dev.lara.map;

import java.util.TreeMap;

/**
 * Adding custom class object as key inside TreeMap
 * Sorting is done because class B is implemnting Comparable interface and copareTo method is present in B class.
 * @author gauraw
 *
 */
class B implements Comparable
{
	
	int i;
	B(int i){
		this.i=i;
	}
	
	public String toString(){
		return "(i="+i+")";
	}

	
	public int compareTo(Object obj) {
		
		return i-((B)obj).i;
	}
	
}
public class P120 
{
	public static void main(String[] args) {

		TreeMap tMap=new TreeMap();
		
		tMap.put(new B(9), "ABC2");
		tMap.put(new B(90), "ABC3");
		tMap.put(new B(5), "ABC1");
		
		//Sorting is done because class B is implemnting Comparable interface and copareTo method is present in B class.
		
		System.out.println("tMap object:::::"+tMap);
		
	}
}
