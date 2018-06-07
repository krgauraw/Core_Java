package dev.logic.array.sec.one;


/**
 * wap to left rotate 2 element
 * @author gauraw
 *
 */
public class P29 
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
		
		int temp1=a[0];
		int temp2=a[1];
		
		for (int i = 2; i < a.length; i++) 
		{
			a[i-2]=a[i];
		}
		a[a.length-2]=temp1;
		a[a.length-1]=temp2;
		
		System.out.println("After 2 left rotate:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
	}
}
