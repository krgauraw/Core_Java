package dev.lara.list;

/**
 * Custom LinkedList class.
 * @author gauraw
 *
 */

class Element
{
	Element next;
	Element prev;
	Object data;
}

public class CustomLinkedList {

	private Element front,back;
	
	public void add(Object o1){
		Element e=new Element();
		e.data=o1;
		if(front==null){
			front=e;
		}else{
			back.next=e;
		}
		e.prev=back;
		back=e;
		//back.next=front	// for circular
	}
	
	public void iterate(){
		Element e=front;
		while(e!=null){
			System.out.print(e.data+" ");
			e=e.next;
		}
	}
}
