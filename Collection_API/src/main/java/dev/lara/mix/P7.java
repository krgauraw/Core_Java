package dev.lara.mix;

import java.util.ArrayList;
/**
 * Not clear
 * @author gauraw
 *
 */
class UtilList extends ArrayList
{
	private ArrayList list;
	
	public UtilList(ArrayList list){
		this.list=list;
	}
	
	public boolean add(Object o){
		boolean flag=false;
		synchronized(list){
			flag=list.add(o);
		}
		return flag;
	}
	
	public Object get(int index){
		Object obj=null;
		synchronized(list){
			obj=list.get(index);
		}
		return obj;
	}
	
	public Object set(int index, Object element){
		Object obj=null;
		synchronized(list){
			obj=list.set(index, element);
		}
		return obj;
	}
	
	public Object remove(int index){
		Object obj=null;
		
		synchronized(list){
			obj=list.remove(index);
		}
		return obj;
	}
	
	// same for all other method.
}

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ArrayList list=new ArrayList();
		list=new UtilList(list);
		list.add(150);
		list.add("abc");
		list.add("hello");
		list.add(90.90000);
		System.out.println("list data::::"+list); // will not get any output because toString() is not overrided in UtilList class.
		System.out.println("list.get(2)::::::"+list.get(2));
		System.out.println("list.remove(1)::::"+list.remove(1));*/
		
		ArrayList list1=new ArrayList();	//list1 is not thread safe
		//testMultiThreadEnv(list1);
		list1=new UtilList(list1); // Now list1 is thread safe
		testMultiThreadEnv(list1);
	}
	
	//method to check for thread safe
	static void testMultiThreadEnv(final ArrayList list){
		
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println("from thread 1");
					list.add(i);
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println("from thread 2");
					list.add(i);
				}
			}
		}.start();
	}

}
