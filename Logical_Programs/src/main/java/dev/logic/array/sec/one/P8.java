package dev.logic.array.sec.one;

/**
 * How to read first half and second half elements separately
 * @author gauraw
 *
 */
public class P8 
{
	public static void main(String[] args) {
		
		int[] array={10,20,30,40,50,60,70,80,90,100};
		
		int mid=array.length/2;
		
		for (int i = 0; i < mid; i++) 
		{
			System.out.println(array[i]);
		}
		System.out.println("--------------");
		
		for(int i=mid; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	

	
	
}
