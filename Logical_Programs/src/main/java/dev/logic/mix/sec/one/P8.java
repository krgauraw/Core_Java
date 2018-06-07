package dev.logic.mix.sec.one;

/**what will be output?
 * output: "Static method called" message will be printed.
 * Explanation: We can call static methods using reference variable which is pointing to 
 * null because static methods are class level so we can either call using class name and 
 * reference variable which is pointing to null.
 * @author gauraw
 *
 */
public class P8 {

	public static void show(){
        System.out.println("Static method called");
	}
 
	public static void main(String[] args)  {
        P8 obj=null;
        obj.show();
    	}
}
