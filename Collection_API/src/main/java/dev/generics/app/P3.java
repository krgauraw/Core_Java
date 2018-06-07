package dev.generics.app;

import java.util.Arrays;

/**
 * Generic method with bounded type.
 * @author gauraw
 *
 */

public class P3 {
	
	//generic method to check equality. Methos name is isIn
	static <T,V extends T> boolean isIn(T x, V[] y)
	{
		for(int i=0;i<y.length;i++){
			if(x.equals(y[i])){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		Integer nums[]={1,2,3,4,5};
		
		if(isIn(2,nums)){
			System.out.println("2 is present in:::::::::::"+Arrays.toString(nums));
		}
		
		if(!isIn(7,nums)){
			System.out.println("7 is not present in::::::::::"+Arrays.toString(nums));
		}
		
		//using isIn() on String
		String strs[]={"Hi","Hello","Hey","Welcome"};
		
		if(isIn("Hi",strs)){
			System.out.println("Hi is present in :::::::::::"+Arrays.toString(strs));
		}
		
	}
}
