package dev.logic.mix.sec.one;

import java.util.Arrays;

/**
 * Find Second smallest number in an array
 * 
 * @author gauraw
 *
 */
public class SecondSmallestNumber {

	public static void main(String[] args) {

		int[] x = { 10, 11, 12, 13, 14, 6, 3, -1 };

		int small = x[0];

		for (int i = 0; i < x.length; i++) {
			if (x[i] < small) {
				small = x[i];
			}
		}
		System.out.println("Smallest Number: " + small);
		int sec_Small = x[0];

		for (int i = 0; i < x.length; i++) {
			if (x[i] < sec_Small && x[i] != small) {
				sec_Small = x[i];
			}
		}

		System.out.println("Second Smallest Number: " + sec_Small);

		System.out.println("------------------------");

		//Another way - no chance to fail
		int numbers[] = { 10, 11, 12, 13, 14, 6, 3, -1 };
		Arrays.sort(numbers);
		System.out.println("Smallest Number: " + numbers[0]);
		System.out.println("Second Smallest Number: " + numbers[1]);

		//Other way - will fail to provide second lowest if lowest value will come at index 0
		/*
		 * int numbers[] = {6,3,37,12,46,5,64,21}; int smallest = numbers[0];
		 * int second_smallest = numbers[0];
		 * 
		 * for(int n:numbers){
		 * 
		 * if(smallest > n){ second_smallest = smallest; smallest =n; } else
		 * if(second_smallest > n){ second_smallest = n; } }
		 * System.out.println("Smallest Number: "+smallest);
		 * System.out.println("Second Smallest Number: "+second_smallest);
		 */
	}

}
