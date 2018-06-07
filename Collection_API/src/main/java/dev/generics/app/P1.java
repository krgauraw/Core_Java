package dev.generics.app;

/**
 * Simple Program using Generic
 * @author gauraw
 *
 */

class A<T>
{
	T obj;
	A(T obj){
		this.obj=obj;
	}
	
	T getObj(){
		return obj;
	}
	
	void showType(){
		System.out.println("Type of T is::::::::::"+obj.getClass().getName());
	}
}

public class P1 
{
	public static void main(String[] args) {
		
		A<Integer> obj=new A<Integer>(100);
		obj.showType();
		
		int val=obj.getObj();
		System.out.println("Value is::::"+val);
		
		System.out.println("---------------------------------------");
		
		A<String> obj1=new A<String>("Hi");
		obj1.showType();
		
		String str=obj1.getObj();
		System.out.println("Value is::::::"+str);
	}
	
}
