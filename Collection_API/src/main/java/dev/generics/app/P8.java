package dev.generics.app;

/**
 * generic class with Wild Card demonstration
 * @author gauraw
 *
 */
class E<T extends Number>{
	
	T[] nums;
	E(T[] arg){
		nums=arg;
	}
	
	double getAverage(){
		double sum=0.0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	
	boolean isSameAverage(E<?> obj){
		if(getAverage()==obj.getAverage()){
			return true;
		}
		return false;
	}
}
public class P8 {

	public static void main(String[] args) {
		
		Integer nums[]={10,20,30,40,50};
		E<Integer> e1=new E<Integer>(nums);
		System.out.println("Average value is::::"+e1.getAverage());
		
		Double nums1[]={10.2,20.5,30.33,40.55};
		E<Double> e2=new E<Double>(nums1);
		System.out.println("Average value is::::::"+e2.getAverage());
		
		if(e1.isSameAverage(e2)){
			System.out.println("Average of object e1 & e2 are same");
		}else{
			System.out.println("Average of object e1 & e2 are not same");
		}
	}
}
