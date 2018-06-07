package dev.lara.set;

import java.util.HashSet;

/**
 * same concept as in previous. Identifying duplicates based on both value i & j of custom class object.
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
	
	//overrided 
	public String toString(){
		return "(i="+i+", j="+j+")";
	}
	//overrided 
	public int hashCode(){
		int hash1=Integer.toString(i).hashCode();
		int hash2=Integer.toString(j).hashCode();
		return hash1+hash2;
	}
	//overrided 
	public boolean equals(Object obj){
		return (obj instanceof F && i==((F)obj).i && j==((F)obj).j);
	}
}
public class P96 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add(new F(1,2));
		set.add(new F(1,2)); // Not added. HashSet is able to identify duplicates.
		
		set.add(new F(2,1));
		set.add(new F(2,1)); // Not Added. duplicate
	
		System.out.println("set elements::"+set);
		
		// Output	:	set elements::[(i=2, j=1), (i=1, j=2)]
	}

}
