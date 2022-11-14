// A program that demonstrates MultiThreding in java
package com.capgemini.javaday6;

class Eclipse3 extends Thread{
	
	public void run()
	{
	    
		for (int i = 0; i < 3; i++) {
			System.out.println("Eclipse Thread name is" + Thread.currentThread().getName());
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class MultiThreding3 {
	
	public static void main(String[] args) {
		Eclipse3 e=new Eclipse3();
		e.start();
		
		Eclipse3 e1=new Eclipse3();
		e1.start();
		
		   
		}
	}

