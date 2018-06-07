package dev.logic.array.sec.one;

/**
 * wap to right rotate one element
 * @author gauraw
 *
 */
public class P27 
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
		 
		//Rotating right by one
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		
		System.out.println("After one right rotation:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
	}
}
