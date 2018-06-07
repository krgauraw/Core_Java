package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Sorting list having Custom class object using Collections.sort().
 * @author gauraw
 *
 */
class C
{
	int i;
	C(int i){
		this.i=i;
	}
	
	public String toString(){
		return "i="+i;
	}
}
public class P59 {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(new C(10)); //storing C object inside list object.
		list.add(new C(20));
		list.add(new C(30));
		list.add(new C(40));
		list.add(new C(50));
		
		System.out.println("list elements::::"+list); // toString() of C class is called internally.
		
		Collections.sort(list); // gives ClassCastException because C objects are not compatible because C class doesn't implement Comparable Interface
		
		System.out.println("list elements::::"+list);
	}
}
