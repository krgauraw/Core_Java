package dev.logic.array.sec.one;

/**
 * write a program to which has to left shift one element the array
 * @author gauraw
 *
 */
public class P24 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		
		System.out.println("Actual Array:");
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for (int i = 1; i < a.length; i++) 
		{
			a[i-1]=a[i];
		}
		
		System.out.println("After left shift:");
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
