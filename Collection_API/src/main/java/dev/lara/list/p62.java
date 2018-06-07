package dev.lara.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Implementing different class to provide sorting functionality based on different data present in object.
 * @author gauraw
 *
 */
class F
{
	int i,j;
	
	F(int i, int j){
		this.i=i;
		this.j=j;
	}
	
	public String toString(){
		return "i="+i+",j="+j;
	}
}

class G implements Comparator
{

	
	public int compare(Object o1, Object o2) { // comparison based on i
		F f1=(F)o1;
		F f2=(F)o2;
		return f1.i-f2.i;
	}
}

class H implements Comparator
{

	
	public int compare(Object o1, Object o2) { // comparison based on j
		F f1=(F)o1;
		F f2=(F)o2;
		return f1.j-f2.j;
	}
}
public class p62 {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();
		list.add(new F(1,20)); //storing F object inside list object.
		list.add(new F(4,10));
		list.add(new F(6,50));
		list.add(new F(5,40));
		list.add(new F(3,30));
		
		System.out.println("list elements::::"+list); // toString() of F class is called internally.
		
		Collections.sort(list,new G()); // sorting based on i . comparator type object passed
		System.out.println("list elements after sorting based on i::::"+list);
		Collections.sort(list,new H()); // sorting based on j . comparator type object passed
		System.out.println("list elements after sorting based on j::::"+list);
	}

}
