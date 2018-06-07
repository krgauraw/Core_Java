package dev.logic.array.sec.two;

/**
 * wap to sort first half in ascending order and 2nd half in descending order.
 * @author gauraw
 *
 */
public class P36 
{
	public static void main(String[] args) 
	{
		int[] array={10,2,5,3,13,7,20,15};
		
		System.out.println("Actual Array:");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(+array[i]+" ");
		}
		System.out.println();
		
		int n=array.length;
		int middle=n/2;
		int x;
		
		for (int i = 0; i <(middle-1); i++) 
		{
			for (int j = 0; j <middle-i-1; j++) 
			{
				if(array[j]>array[j+1])
				{
					x=array[j];
					array[j]=array[j+1];
					array[j+1]=x;
				}
			}
		}
		
		for (int i = middle,k=0; i <(n-1); i++,k++) 
		{
			for (int j = middle; j <n-k-1; j++) 
			{
				if(array[j]<array[j+1])
				{
					x=array[j];
					array[j]=array[j+1];
					array[j+1]=x;
				}
			}
		}
		
		System.out.println("Sorted Array:");
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(+array[i]+" ");
		}
	}
}
