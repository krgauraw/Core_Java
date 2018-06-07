package dev.coll.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creating a new arrayList from another Collection.
 * Converting an array to ArrayList object
 * @author gauraw
 *
 */
public class P16 {

	public static void main(String[] args) {
		
		String[] array=new String[] {"A","B","C","D"};
		
		System.out.print("Printing array:::::");
		for(String s:array){
			System.out.print(s+" ");
		}
		System.out.println();
		
		List list=new ArrayList<String>(Arrays.asList(array)); //Arrays.asList() convert an array into list
		
		System.out.println("list:::"+list);
	}
}
