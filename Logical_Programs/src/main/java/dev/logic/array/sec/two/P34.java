package dev.logic.array.sec.two;

/**
 * wap to remove duplicates in an array
 * @author gauraw
 *
 */
public class P34 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,20,10,6,7,4,2,30};
		
		System.out.println("Actual Array:");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		
		int end=a.length;
		
		for (int i = 0; i<end; i++) 
		{
			for(int j=i+1;j<end;j++)
			{
				if(a[i]==a[j])
				{
					int shiftLeft=j;
					
					for(int k=j+1;k<end;k++,shiftLeft++)
					{
						a[shiftLeft]=a[k];
					}
					end--;
					j--;
				}
			}
		}
		
		int[] b=new int[end];
		
		for (int i = 0; i < end; i++) 
		{
			b[i]=a[i];
		}
		
		System.out.println("New Array:");
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
		System.out.println("");
		
		
	}
}
