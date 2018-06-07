package dev.generics.app;

/**
 * A generic class can be child class of non generic class.
 * 
 * @author gauraw
 *
 */

// Non generic class
class NonGen{
	int num;
	NonGen(int i){
		num=i;
	}
	
	int getNumber(){
		return num;
	}
}

// generic class
class Gen<T> extends NonGen{

	T obj;
	// constructor is required here.
	Gen(T obj, int i) {
		super(i);
		this.obj=obj;
	}
	
	T getObject(){
		return obj;
	}
	
}

//class for demonstration
public class P9 {

	public static void main(String[] args) {
		
		Gen<String> obj=new Gen<String>("Hello",10);
		
		System.out.println("object data (child class data)::::"+obj.getObject());
		System.out.println("instance variable data (super class data) accessing with child class object::::"+obj.getNumber());
	}
}
