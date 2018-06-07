package dev.lara.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Implementing comparator Interface in Custom class.
 * Custom class objects are stored into TreeSet.
 * @author gauraw
 *
 */

class L
{
	int i,j;
	L(int i, int j){
		this.i=i;
		this.j=j;
	}
	
	public String toString(){
		return "(i="+i+", j="+j+")";
	}
	
	// static inner class
	static class A implements Comparator{ //based on i value

		@Override
		public int compare(Object o1, Object o2) {
			
			return ((L)o1).i-((L)o2).i;
		}
	}
	
	static class B implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			return ((L)o1).j-((L)o2).j;
		}
		
	}
}
public class P105 {

	public static void main(String[] args) {
		
		TreeSet tSet1=new TreeSet(new L.A());	// comparator type is supplied.
		
		tSet1.add(new L(1,0));
		tSet1.add(new L(2,1));
		tSet1.add(new L(0,4));
		tSet1.add(new L(5,2));
		tSet1.add(new L(4,3));
		// auto sorting is success based on i value because of comparator object.
		System.out.println("Printing tSet1::::::::"+tSet1);
		
		TreeSet tSet2=new TreeSet(new L.B());	// comparator type is supplied
		tSet2.add(new L(1,0));
		tSet2.add(new L(2,1));
		tSet2.add(new L(0,4));
		tSet2.add(new L(5,2));
		// auto sorting is success based on j value because of comparator object.
		System.out.println("Printing tSet1::::::::"+tSet2);
	}

}
