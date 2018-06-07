package dev.lara.map;

import java.util.TreeMap;

/**
 * Adding custom class object as key into TreeMap .
 * In order to support auto sorting feature, custom class must implement comparable or comparator 
 * @author gauraw
 *
 */

class A{
	
	int i;
	A(int i){
		this.i=i;
	}
	
	public String toString(){
		return "(i="+i+")";
	}
}

public class P119 {

	public static void main(String[] args) {
		
		TreeMap tMap=new TreeMap();
		
		tMap.put(new A(9), "ABC");
		tMap.put(new A(90), "HI");
		tMap.put(new A(5), "HEY");
		
		/*Exception in thread "main" java.lang.ClassCastException: dev.lara.map.A cannot be cast to java.lang.Comparable
		at java.util.TreeMap.compare(Unknown Source)
		at java.util.TreeMap.put(Unknown Source)
		at dev.lara.map.P119.main(P119.java:29)*/
		
		System.out.println("tMap Object:::::"+tMap);
	}

}
