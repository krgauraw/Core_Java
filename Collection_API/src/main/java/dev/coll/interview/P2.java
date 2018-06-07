package dev.coll.interview;

import java.util.Arrays;
import java.util.Collections;

//To find minimum and maximum number from an array.
public class P2 
{
	public static void main(String[] args) 
	{
		Integer[] array={8,2,0,4,9,25,6,7,90,1};
		
		int min=(int)Collections.min(Arrays.asList(array));
		int max=(int)Collections.max(Arrays.asList(array));
		System.out.println("Minimum: "+min);
		System.out.println("Maximum: "+max);
	}
}
