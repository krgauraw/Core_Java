package dev.coll.interview;

import java.util.Arrays;

/**
 * sort a byte array. sorting can be done by using Arrays.sort(). 
 * @author gauraw
 *
 */
public class P6 {

	public static void main(String[] args) {
		
		byte[] bArray=new byte[] {1,3,6,2,8,5,7,4};
		
		System.out.println("printing unsorted array:::::");
		for(byte b:bArray){
			System.out.print(b+" ");
		}
		System.out.println();
		
		Arrays.sort(bArray);	// performing sort operation using Arrays.sort()
		
		System.out.println("printing sorted array:::::");
		for(byte b:bArray){
			System.out.print(b+" ");
		}
	}

}
