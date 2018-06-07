package dev.logic.array.sec.two;

/**
 * wap to right rotate two element .
 * @author gauraw
 *
 */
public class P31
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
		
		int temp1=a[a.length-1];
		int temp2=a[a.length-2];
		
		for(int i=a.length-1;i>1;i--)
		{
			a[i]=a[i-2];
		}
		a[1]=temp1;
		a[0]=temp2;
		
		System.out.println("After 2 rotation:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
	}
}
