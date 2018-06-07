package dev.lara.set;

import java.util.TreeSet;

/**
 * adding custom class object as data inside TreeSet .
 * In order to support auto sorting feature of TreeSet, the custom class must implements Comparable or Comparator Interface.
 * @author gauraw
 *
 */
class J{
	int x;
	J(int x){
		this.x=x;
	}
	
	public String toString(){
		return "x="+x;
	}
}
public class P103 {

	public static void main(String[] args) {
		
		TreeSet tSet=new TreeSet();
		tSet.add(new J(10));	//ClassCastExcetion
		tSet.add(new J(20));	// class J is not implementing Comparable Interface. So we can't add J objects to TreeSet Object
		tSet.add(new J(30));	//because TreeSet must have auto sorting feature.
		tSet.add(new J(40));	// Without Comparable Interface Auto Sorting is not possible.
		tSet.add(new J(5));
		System.out.println("tSet elements:::"+tSet);
	}

}
