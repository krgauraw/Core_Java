package dev.lara.map;

import java.util.TreeMap;

/**
 * TreeMap sorting based on custom class value
 * @author gauraw
 *
 */

class MapD implements Comparable
{
	int i;
	MapD(int i){
		this.i=i;
	}
	
	public String toString(){
		return "i="+i;
	}
	
	public int hashCode(){
		return Integer.toString(i).hashCode();
	}
	
	public boolean equals(Object obj){
		return i==((MapD)obj).i;
	}

	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return i-((MapD)o).i;
	}
	
}
public class P122 {

	public static void main(String[] args) {
		
		TreeMap map=new TreeMap();	// sorting done based on value supplied in MapD() constructor
		map.put(new MapD(9), "abc1");
		map.put(new MapD(9), "abc2");
		map.put(new MapD(9), "abc3");
		map.put(new MapD(90),"abc4");
		map.put(new MapD(80), "abc6");
		
		System.out.println("TreeMap Object map elements:::"+map);
		
	}

}
