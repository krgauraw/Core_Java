package dev.coll.exp1;

public class CustomQueueImpl 
{
	public static void main(String[] args) 
	{
		CustomQueue q1=new CustomQueue();
		q1.addElement(10);
		q1.addElement(20);
		q1.addElement(30);
		q1.addElement(40);
		q1.addElement(50);
		int n=q1.getQueue().size();
		
		System.out.println("Elements inside queue::"+q1);
		
		System.out.println("Processing Queue:::");
		
		for (int i = 0; i <n; i++) 
		{
			System.out.print(q1.processElement()+" ");
		}
	}
}
