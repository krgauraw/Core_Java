package dev.lara.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * TreeMap demo.
 * Sorting based on different values present in key. Here a custom class object is used as a key.
 * @author gauraw
 *
 */

class MapC 
{
	int i,j;
	MapC(int i, int j){
		this.i=i;
		this.j=j;
	}
	
	public String toString(){
		return "(i="+i+", j="+j+")";
	}
	//static inner class
	static class MapD implements Comparator
	{
		
		public int compare(Object o1, Object o2) {
			
			return ((MapC)o1).i-((MapC)o2).i;	//based on i 
		}
	}
	//static inner class
	static class MapE implements Comparator
	{
		
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return ((MapC)o1).j-((MapC)o2).j;	//based on j
		}
	}
}


public class P121 
{
	public static void main(String[] args) {
		
		TreeMap map1=new TreeMap(new MapC.MapD()); // sorting based on i
		
		map1.put(new MapC(9, 1), 9);
		map1.put(new MapC(0, 10), 19);
		map1.put(new MapC(1, 8),92 );
		map1.put(new MapC(8, 0), 91);
		map1.put(new MapC(5, 4), 39);
		
		System.out.println("Map Object map1 elements:::"+map1);
		
		TreeMap map2=new TreeMap(new MapC.MapE()); // sorting based on j
		
		map2.put(new MapC(9, 1), 9);
		map2.put(new MapC(0, 10), 19);
		map2.put(new MapC(1, 8),92 );
		map2.put(new MapC(8, 0), 91);
		map2.put(new MapC(5, 4), 39);
		
		System.out.println("Map Object map2 elements:::"+map2);
	}
}
