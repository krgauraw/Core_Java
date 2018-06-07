package dev.logic.array.sec.two;

/**
 * wap to short array elements
 * @author gauraw
 *
 */
public class P35 
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
		int temp;
		
		for (int i = 0; i <(n-1); i++) 
		{
			for (int j = 0; j <n-i-1; j++) 
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
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
