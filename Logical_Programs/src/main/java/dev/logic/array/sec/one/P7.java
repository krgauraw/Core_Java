package dev.logic.array.sec.one;

/**
 * How to read only even indexed elements of an array.
 * @author gauraw
 *
 */
public class P7 
{
	public static void main(String[] args) {
		
		int[] array={10,20,30,40,50,60,70,80};
		
		//Printing even indexed element
		for(int i=0;i<array.length;i+=2)
		{
			System.out.print(array[i]+" ");
		}
	}
}
