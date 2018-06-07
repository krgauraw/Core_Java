package dev.generics.app;

/**
 * Generic Constructor with bounded type
 * @author gauraw
 *
 */

class C{
	
		private double val;
		
		//generic constructor
		<T extends Number> C(T arg){
			System.out.println("Argument type::::"+arg.getClass().getName());
			this.val=arg.doubleValue();
		}
		
		void showValue(){
			System.out.println("Value is::"+val);
		}
}
public class P4 {

	public static void main(String[] args) {
		
		C c1=new C(100);
		C c2=new C(200.5F);
		//C c3=new C("Hello"); This is not allowed. C.T.E
		c1.showValue();
		c2.showValue();
	}
}
