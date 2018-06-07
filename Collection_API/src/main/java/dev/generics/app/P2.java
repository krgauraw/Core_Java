package dev.generics.app;

/**
 * Generic class with two type parameters
 * @author gauraw
 *
 */

class B<T,V>
{
	T obj1;
	V obj2;
	
	B(T t1,V v1){
		obj1=t1;
		obj2=v1;
	}
	
	public void showTypes(){
		System.out.println("Type of T is::::::::::"+obj1.getClass().getName());
		System.out.println("Type of V is::::::::::"+obj2.getClass().getName());
	}
	
	T getObj1(){
		return obj1;
	}
	
	V getObj2(){
		return obj2;
	}
}


public class P2 {

	public static void main(String[] args) {
		
		B<Integer,String> obj=new B<Integer,String>(10,"Hi");
		obj.showTypes();
		int val1=obj.getObj1();
		String val2=obj.getObj2();
		System.out.println("Type T Value is::::::::"+val1);
		System.out.println("Type V Value is::::::::"+val2);
		
		System.out.println("---------------------------------------");
		
		B<String,Boolean> obj1=new B<String,Boolean>("Hello",true);
		obj1.showTypes();
		String val3=obj1.getObj1();
		boolean val4=obj1.getObj2();
		System.out.println("Type T Value is:::::::::::"+val3);
		System.out.println("Type V Value is:::::::::::"+val4);
		
		
	}
}
