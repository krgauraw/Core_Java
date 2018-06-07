package dev.logic.array.sec.one;

/**
 * Find out the index of an array, where left sum should be same as right sum.
 * @author gauraw
 *
 */
public class P22 {

	public static void main(String[] args) {
		//int[] numbers={2,4,4,5,4,1};
		int[] numbers={2,4,4,2,4,7,4,5};
		
		int leftSum=0;
		int rightSum=0;
		int startIndex=0;
		int lastIndex=numbers.length-1;
		
		while(true){
			
			if(leftSum>rightSum){
				rightSum+=numbers[lastIndex--];
			}else{
				leftSum+=numbers[startIndex++];
			}
			if(startIndex>lastIndex){
				if(leftSum==rightSum){
					System.out.println("@Index:::"+lastIndex);
				}else{
					System.out.println("Doesn't have");
				}
				break;
			}
		}
	}
}
