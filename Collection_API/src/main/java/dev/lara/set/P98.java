package dev.lara.set;

import java.util.HashSet;

/**
 * look inside code.
 * @author gauraw
 *
 */

class I
{
	int i,j;	//two attributes
	I(int i, int j){
		this.i=i;
		this.j=j;
	}
	
	//overrided 
	public String toString(){
		return "(i="+i+", j="+j+")";
	}
	//overrided 
	public int hashCode(){
		return Integer.toString(i).hashCode();	// only i is considered
	}
	//overrided 
	public boolean equals(Object obj){
		return (obj instanceof I &&  i==((I)obj).i);	// only i is considered here.
	}
}
public class P98 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add(new I(1,2));
		set.add(new I(1,3));
		set.add(new I(1,5));
		set.add(new I(2,1));
		
		System.out.println("set elements:::"+set);
		System.out.println("set size:::"+set.size());
		
		// Output:
		/*set elements:::[(i=2, j=1), (i=1, j=2)]
		set size:::2*/
	}

}
