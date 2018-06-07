package dev.logic.array.sec.one;

/**
 * How to read elements of an array in reverse order
 * @author gauraw
 *
 */
public class P5 
{
	public static void main(String[] args) 
	{
		int[] array={10,20,30,40,50};
		
		for (int i=array.length-1;i>=0;i--) 
		{
			System.out.print(array[i]+" ");
		}
	}
}
