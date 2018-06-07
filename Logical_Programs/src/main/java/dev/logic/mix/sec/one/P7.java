package dev.logic.mix.sec.one;

/**What will be the output???
 * output: java.lang.StackOverflowError
 * 
 * Explanation:
 * Whenever we create the object of any class constructor will be called first and 
   memory allocated for all non static variables
 *
 * Here  B b= new B(); variable is object and assigned to new object of same class.
   B b= new B(); statement leads to recursive execution of constructor will create 
   infinite objects so at run time an exception will be raised Exception in thread "main"
   java.lang.StackOverflowError
 *  The common cause for a stack overflow exception  is a bad recursive call. 
 *  Typically this is caused when your recursive functions doesn't have the correct 
 *  termination condition
 * @author gauraw
 *
 */
public class P7 {

	P7 obj1=new P7();	//Exception in thread "main" java.lang.StackOverflowError
	
	public int show(){
		return (true?null:0);
	}
	
	//to realize the scenario, we can use a default constructor.
	public P7(){
		System.out.println("Creating Object............");
	}
	
	public static void main(String[] args) {
		P7 obj=new P7();
		obj.show();	// this line simply cause java.lang.NullPointerException if line 22 will be commented
	}
}
