package dev.generics.app;

/**
 * Generic method demonstration.
 * @author gauraw
 *
 */
public class P5 
{
	//generic method.
	public static <T> void printArray(T[] array){
		for(T element:array){
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray={10,20,30,40,50};
		Double[] doubleArray={10.44,20.32,33.93,40.32,50.55};
		Character[] charArray={'A','B','C','D','E'};
		
		System.out.print("Integer Array contains::::");
		printArray(intArray);
		
		System.out.print("Double Array contains::::");
		printArray(doubleArray);
		
		
		System.out.print("Character Array contains::::");
		printArray(charArray);
	}
}
