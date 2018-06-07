package dev.lara.set;

import java.util.TreeSet;

/**
 * TreeSet demo with custom class which implementing comparable interface and overriding compareTo().
 * @author gauraw
 *
 */
class K implements Comparable{
	int x;
	K(int x){
		this.x=x;
	}
	public String toString(){
		return "x="+x;
	}
	@Override
	public int compareTo(Object obj) {
		return x-((K)obj).x;
	}
}
public class P104 {

	public static void main(String[] args) {
		
		TreeSet tSet=new TreeSet();
		
		tSet.add(new K(10));	// element added successfully.
		tSet.add(new K(1));
		tSet.add(new K(5));
		tSet.add(new K(3));
		tSet.add(new K(7));
		
		System.out.println("tSet element::::"+tSet);
	}

}
