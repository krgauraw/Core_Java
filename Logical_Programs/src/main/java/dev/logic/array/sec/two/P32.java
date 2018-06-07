package dev.logic.array.sec.two;

/**
 * wap for binary search in an array.
 * @author gauraw
 *
 */
public class P32 
{
	public static void main(String[] args) 
	{
		int[] x={3,9,20,40,400,320,180,260};
		
		int i=binarySearch(x,20);
		
		System.out.println(i);
	}
	
	private static int binarySearch(int[] x,int element)
	{
		int index=-1;
		int begin=0;
		int last=x.length-1;
		int middle;
		
		while(last>=begin)
		{
			middle=(begin+last)/2;
			
			if(x[middle]==element)
			{
				index=middle;
				break;
			}
			
			if(x[middle]>element)
			{
				last=middle-1;
			}
			else
			{
				begin=middle+1;
			}
		}
		
		if(index==-1)
		{
			if(element<x[0])
			{
				return index;
			}
			
			int j=-1;
			
			for (int i = 0; i < x.length; i++) 
			{
				j--;
				
				if(x[i]<element && x[i+1]>element)
				{
					break;
				}
				
			}
			
			if(element>x[x.length-1])
			{
				j--;
			}
			index=j;
		}
		
		return index;
	}
}
