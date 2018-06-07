package dev.lara.list;

import java.util.ArrayList;

/**
 * toString() demonstration with custom Class.
 * @author gauraw
 *
 */
class A	// Not implementing Comparable Interface. toString() method is not overrided. 
{
	int i;
	A(int i){
		this.i=i;
	}
}
public class P57 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add(10);
		list.add("ABC");
		list.add(new A(50));
		list.add(new A(100));
		
		System.out.println("List Elements:::"+list);
		// Output:::List Elements:::[10, ABC, dev.lara.arrayList.A@5fb271f1, dev.lara.arrayList.A@3c56b64c]
		//calling Object class toString() of object class internally.
	}

}
