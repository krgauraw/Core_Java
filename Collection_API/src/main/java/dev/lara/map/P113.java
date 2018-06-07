package dev.lara.map;

import java.util.HashMap;

/**
 * Adding custom class object as key.
 * @author gauraw
 *
 */
class Test{
	int i;
	
	Test(int i){
		this.i=i;
	}
	
	public String toString(){
		return "(i="+i+")";
	}
}

public class P113 {

	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		
		map.put(1, "100");
		map.put(2, "200");
		map.put(3, "300");
		map.put(new Test(4), 500);
		map.put(new Test(5), "600");
		
		System.out.println("Printing HashMap Object::::::::map::::::::"+map);
	}

}
