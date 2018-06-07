package dev.lara.set;

import java.util.HashSet;

/**
 * same as in P96
 * @author gauraw
 *
 */
class G
{
	int i,j;
	G(int i, int j){
		this.i=i;
		this.j=j;
	}
	
	//overrided 
	public String toString(){
		System.out.println("toString()");
		return "(i="+i+", j="+j+")";
	}
	//overrided 
	public int hashCode(){
		System.out.println("hashCode()");
		int hash1=Integer.toString(i).hashCode();
		int hash2=Integer.toString(j).hashCode();
		return hash1+hash2;
	}
	//overrided 
	public boolean equals(Object obj){
		System.out.println("equals()");
		return (obj instanceof F && i==((F)obj).i && j==((F)obj).j);
	}
}

public class P97 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add(new G(1,2));
		set.add(new G(1,2));
		set.add(new G(2,1));
		set.add(new G(2,1));
		
		System.out.println("set elements:::"+set);
		System.out.println("set size:::"+set.size());
		
		// Output :
		/*hashCode()
		hashCode()
		equals()
		hashCode()
		equals()
		equals()
		hashCode()
		equals()
		equals()
		equals()
		toString()
		toString()
		toString()
		toString()
		set elements:::[(i=2, j=1), (i=2, j=1), (i=1, j=2), (i=1, j=2)]
		set size:::4*/
	}

}
