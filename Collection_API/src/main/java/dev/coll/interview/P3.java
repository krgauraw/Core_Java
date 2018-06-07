package dev.coll.interview;

import java.util.Arrays;
import java.util.List;

//convert an array to a list
public class P3 {
	public static void main(String[] args) {

		String cars[] = { "A", "B", "C", "D" };
		List<String> carsList = Arrays.asList(cars); // converted array into a list
		//ArrayList<String> carsList=(ArrayList)Arrays.asList(cars); 
		// 2nd way. done explicit casting but encountered java.lang.ClassCastException
		for (String car : carsList) {
			System.out.print(car + " ");
		}
	}

}
