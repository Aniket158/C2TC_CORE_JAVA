// A program that demonstrates MultiThreding in java
package com.capgemini.javaday6;

class Eclipse2 implements Runnable{
	
	public void run()
	{
	    
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is" + Thread.currentThread().getId());
	}
}

public class MultiThreding2 {
	
	public static void main(String[] args) {
		Eclipse2 e=new Eclipse2();
		Thread t=new Thread(e);
		t.start();
	        
			System.out.println("Main Thread name is" + Thread.currentThread().getName());
			System.out.println("Main Thread ID is" + Thread.currentThread().getId());

		}
	}

