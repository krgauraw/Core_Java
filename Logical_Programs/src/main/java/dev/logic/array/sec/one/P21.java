package dev.logic.array.sec.one;

/**
 * Find out sequential 3 indexes where difference of first two should be same as third?
 * @author gauraw
 *
 */
public class P21 {

	public static void main(String[] args) {
		
		int[] array={4,3,1,2,0,2,3,1,2,10};
		
		int a,b,c;
		
		for (int i = 0; i < array.length-2; i++) {
			a=array[i];
			b=array[i+1];
			c=array[i+2];
			
			if((a-b)==c){
				System.out.println("Sequential Indexes are:::"+i+","+(i+1)+","+(i+2));
			}
		}
	}
}
