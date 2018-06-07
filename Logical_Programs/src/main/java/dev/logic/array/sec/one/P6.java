package dev.logic.array.sec.one;


/**
 * How to read only odd indexed elements from an array
 * @author gauraw
 *
 */
public class P6 
{
	public static void main(String[] args) 
	{
		int[] array={10,20,30,40,50,60,70,80};
		
		for(int i=1;i<array.length;i+=2)
		{
			System.out.print(array[i]+" ");
		}
	}
}
