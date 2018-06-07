package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Implementing Comparabale Interface in custom Class.
 * Need of comparable Interface in order to sort list having custom class object as data.
 * @author gauraw
 *
 */
class D implements Comparable
{
	int i;
	D(int i){
		this.i=i;
	}
	
	public String toString(){
		return "i="+i;
	}

	
	public int compareTo(Object o) {
		return i-((D)o).i;
	}
}
public class P60 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(new D(20)); //storing D object inside list object.
		list.add(new D(10));
		list.add(new D(50));
		list.add(new D(40));
		list.add(new D(30));
		
		System.out.println("list elements::::"+list); // toString() of D class is called internally.
		
		Collections.sort(list); // sorting success because D class is  implementing Comparable Interface
		
		System.out.println("list elements::::"+list);
	}

}
