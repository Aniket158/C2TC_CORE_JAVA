// A program that demonstrates MultiThreding in java
package com.capgemini.javaday6;

class Eclipse1 extends Thread{
	
	public void run()
	{
	    for (int i = 0; i < 4; i++) {
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is" + Thread.currentThread().getId());
	}
}
}


public class MultiThreding1 {
	
	public static void main(String[] args) {
		Eclipse1 e=new Eclipse1();	
	    e.start();
	        
	    	    for (int i = 0; i < 4; i++) {
			System.out.println("Main Thread name is" + Thread.currentThread().getName());
			System.out.println("Main Thread ID is" + Thread.currentThread().getId());

		}
	}

}