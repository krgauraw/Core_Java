package dev.logic.array.sec.one;

/**
 * wap to right shift one element.
 * @author gauraw
 *
 */
public class P26 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50,60};
		
		System.out.println("Actual Array:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("");
		
		for (int i=a.length-1;i>0;i--) 
		{
			a[i]=a[i-1];
		}
		
		System.out.println("After one right shift:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
		
	}
}

