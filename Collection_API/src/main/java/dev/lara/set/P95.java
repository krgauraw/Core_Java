package dev.lara.set;

import java.util.HashSet;

/**
 * Overriding hashcode() and equals() inside custom class.
 * Custom Class object added to HashSet and HashSet is able to identify duplicates because both methods are overrided in custom class.
 * @author gauraw
 *
 */
class E
{
	int i;
	E(int i){
		this.i=i;
	}
	
	public String toString(){
		return "i="+i;
	}
	
	public int hashCode(){
		return Integer.toString(i).hashCode();
	}
	
	public boolean equals(Object obj){
		E e1=(E)obj;
		return i==e1.i;
	}
}
public class P95 {
		public static void main(String[] args) {
			
			HashSet set=new HashSet();
			
			set.add(new E(10));
			set.add(new E(10));
			
			set.add(new E(20));
			set.add(new E(20));
			
			set.add(new E(30));
			set.add(new E(30));
			
			//Only 3 elements will be added to HashSet object because HashSet is able to identify duplicates because
			// hashCode() & equals() are overrided in E class.
			System.out.println("set elements:::"+set);
			//Output	:	set elements:::[i=20, i=10, i=30]
		}
}
