package dev.generics.app;

import java.util.ArrayList;
import java.util.List;

/**
 * generic method with bounded type
 * GenericType<? extends upperBoundType>
 * 
 * @author gauraw
 *
 */
public class P6 {

	//generic method 
	public static double getAverage(List<? extends Number> numList){
		double total=0.0;
		
		for(Number number:numList){
			total+=number.doubleValue();
		}
		
		return total/numList.size();
	}
	
	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		System.out.println("Average of list1::::::::"+getAverage(list1));
		
		/*List<String> list2=new ArrayList<String>();
		list2.add("Hello");
		list2.add("Hi");
		list2.add("Hey");
		list2.add("Welcome");
		System.out.println("Average of list2::::::;;;"+getAverage(list2));*/
		
		ArrayList<Float> list2=new ArrayList<Float>();
		list2.add(20.2F);
		list2.add(30.39F);
		list2.add(40.23F);
		System.out.println("Average of list2:::::::::::"+getAverage(list2));
	}
}
