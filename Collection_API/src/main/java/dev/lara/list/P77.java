package dev.lara.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.stream.events.EndElement;

/**
 * Vector class demo. Insert & Read using Vector.
 * Vector is an implementation class of list type.
 * Enumeration is an interface which is used to read Vector object element. hasMoreElement() returns true if element is present.
 * nextElement() is used to get the current element.
 * In Vector, Insertion order is preserved.
 * @author gauraw
 *
 */
public class P77 {

	public static void main(String[] args) {
	
		Vector v=new Vector();
		v.add(10);
		v.add(30);
		v.add(90);
		v.add(20);
		v.addElement(40);
		v.addElement(50);
		
		System.out.println("Vector Object Element::::"+v);
		
		Enumeration enm=v.elements(); //creating Enumeration object to read elements one by one
		System.out.print("Reading through Enumeration object::: ");
		while(enm.hasMoreElements()){
			System.out.print(enm.nextElement()+" ");
		}
		System.out.println();
		Iterator itr=v.iterator();
		System.out.print("Reading through iterator object:::::::::");
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}

}
