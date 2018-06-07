package dev.generics.app;

/**
 * generic class with bounded type
 * the type argument for T must be either Number or a class derived from Number.
 * @author gauraw
 *
 */
class D<T extends Number>
{
	T[] nums;
	
	D(T[] arg){
		nums=arg;
	}
	
	double getAverage(){
		
		double sum=0.0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	
	
}
public class P7 {

	public static void main(String[] args) {
		
		Integer nums[]={10,20,30,40,50};
		D<Integer> d1=new D<Integer>(nums);
		System.out.println("Average value is::::"+d1.getAverage());
		
		Double nums1[]={10.2,20.5,30.33,40.55};
		D<Double> d2=new D<Double>(nums1);
		System.out.println("Average value is::::::"+d2.getAverage());
	}
}
