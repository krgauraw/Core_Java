package dev.logic.array.sec.two;

/**
 * wap to swap odd indexed elements with even indexed elements.
 * @author gauraw
 *
 */
public class P33 
{
	public static void main(String[] args) 
	{
		int[] a={2,4,6,8,12,15,9,1,10,20};
		
		System.out.println("Actual Array:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		
		
		for (int i = 0; i < a.length-1; i+=2) 
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		System.out.println("Swaped Array:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
