package dev.coll.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * shuffle elements of an array
 */
public class P1 
{
	public static void main(String[] args) 
	{
		String[] alphabets={"A","B","C","D","E","F","G","H"};
		
		//converting array to list
		List<String> list=Arrays.asList(alphabets);
		//shuffle
		Collections.shuffle(list);
		
		for(String alpha:list)
		{
			System.out.print(alpha+ " ");
		}
	}
}
