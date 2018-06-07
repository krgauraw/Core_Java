package dev.coll.interview;

/**
 * Copy an array into another array
 * @author gauraw
 *
 */
public class P5 {

	public static void main(String[] args) {
		
		int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] copiedarray=new int[array.length];
		
		System.arraycopy(array, 0, copiedarray, 0, array.length); 	//System.arrayCopy() is used to copy
		
		for(int num:copiedarray){
			System.out.print(num+" ");
		}
	}
}
