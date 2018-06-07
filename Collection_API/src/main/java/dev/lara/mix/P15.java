package dev.lara.mix;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * ArrayblockingQueue demo
 * @author gauraw
 *
 */
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayBlockingQueue<Integer> abq=new ArrayBlockingQueue<Integer>(10);
		produceElement(abq);
		consumeElement(abq);
	}
	
	private static void produceElement(final ArrayBlockingQueue<Integer> abq){
		
		new Thread(){
			public void run(){
				int i=0;
				while(true){
					
					try{
						abq.put(123);
						System.out.println("Element produced");
						
						if(i<10){
							sleep(1000);
							i++;
						}else{
							sleep(30000);
							i++;
						}
					}catch(InterruptedException ex){
						ex.printStackTrace();
					}
				}
			}
		}.start();
	}
	
	private static void consumeElement(final ArrayBlockingQueue<Integer> abq){
		
		new Thread(){
			public void run(){
				
				try 
				{
					sleep(20000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				while(true){
					
					try{
						System.out.println("Consumed Element:::"+abq.take());
						sleep(2000);
					}catch(InterruptedException ex){
						ex.printStackTrace();
					}
				}
			}
		}.start();
	}

}
