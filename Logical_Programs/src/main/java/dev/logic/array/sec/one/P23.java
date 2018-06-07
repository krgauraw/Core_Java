package dev.logic.array.sec.one;

/**
 * Reverse the content of an array.
 * @author gauraw
 *
 */
public class P23 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50,60,70};
		int mid=a.length/2;
		
		System.out.println("Before Reverse:");
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//Reversing...
		for (int i = 0; i <mid; i++) 
		{
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		System.out.println("After Reverse:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
