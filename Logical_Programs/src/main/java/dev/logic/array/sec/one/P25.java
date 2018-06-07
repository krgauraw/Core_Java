package dev.logic.array.sec.one;

/**
 * wap to left rotate one element
 * @author gauraw
 *
 */
public class P25 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50,60,70};
		
		System.out.println("Actual Array:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("");
		
		int temp=a[0];
		
		for (int i = 1; i < a.length; i++) 
		{
			a[i-1]=a[i];
		}
		
		a[a.length-1]=temp;
		
		System.out.println("After Rotation:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
