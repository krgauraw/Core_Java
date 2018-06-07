package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Sorting list data based on one value of custom class object.
 * @author gauraw
 *
 */
class E implements Comparable
{
	int i,j;
	E(int i, int j){
		this.i=i;
		this.j=j;
	}
	
	public String toString(){
		return "i="+i+",j="+j;
	}

	
	public int compareTo(Object o) {
		return i-((E)o).i;	
	}
}
public class P61 {

	public static void main(String[] args) {
	

		ArrayList list=new ArrayList();
		list.add(new E(1,20)); //storing E object inside list object.
		list.add(new E(4,10));
		list.add(new E(6,50));
		list.add(new E(5,40));
		list.add(new E(3,30));
		
		System.out.println("list elements::::"+list); // toString() of E class is called internally.
		
		Collections.sort(list); // sorting success based on i value because E class is  implementing Comparable Interface
		
		System.out.println("list elements::::"+list);
	}

}
