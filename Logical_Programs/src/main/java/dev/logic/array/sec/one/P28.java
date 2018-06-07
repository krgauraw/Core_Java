package dev.logic.array.sec.one;


/**
 * wap to left shift 2 elements 
 * @author gauraw
 *
 */
public class P28 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50,60,70,80};
		
		System.out.println("Actual Array:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("");
		
		for (int i = 2; i < a.length; i++) 
		{
			a[i-2]=a[i];
		}
		
		System.out.println("After 2 left shift:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
	}
}
