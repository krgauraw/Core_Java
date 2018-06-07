package dev.lara.list;

import java.util.ArrayList;

/**
 * overriding toString() in custom class.
 * 
 * @author gauraw
 *
 */
class B {
	int i;

	B(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "i=" + i;
		//return "" + i;
	}
}

public class P58 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(new B(10)); //storing B object inside list object.
		list.add(new B(20));
		list.add(new B(30));
		list.add(new B(40));
		list.add(new B(50));

		System.out.println("list elements::::" + list); // toString() of B class is called internally.
	}

}
