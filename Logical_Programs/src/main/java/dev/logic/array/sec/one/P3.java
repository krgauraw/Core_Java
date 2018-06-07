package dev.logic.array.sec.one;


/**
 * How to assign index itself as an element
 * @author gauraw
 *
 */
public class P3 
{
	public static void main(String[] args) {
		
		int[] array=new int[10];
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=i;
		}
		
		System.out.println("Printing array elements::");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
	}
}
