package dev.lara.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Creating TreeSet object from existing HashSet Object.
 * TreeSet implements SortedSet Interface.
 * @author gauraw
 *
 */
public class P100 {

	public static void main(String[] args) {
		
		HashSet hSet=new HashSet();
		hSet.add(10);
		hSet.add(20);
		hSet.add(30);
		hSet.add(40);
		System.out.println("HashSet Object Elements:::"+hSet);
		
		TreeSet tSet=new TreeSet(hSet);	//HashSet Object is passed as argument. Sorting will happen automatically
		System.out.println("TreeSet Object Elements:::"+tSet);
		
		//Output:
		/*HashSet Object Elements:::[20, 40, 10, 30]
		TreeSet Object Elements:::[10, 20, 30, 40]*/
		
	}

}
