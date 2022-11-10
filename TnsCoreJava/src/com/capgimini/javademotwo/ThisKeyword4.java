// A program that demonstrates working of this keyword in java
package com.capgimini.javademotwo;

public class ThisKeyword4 {
	int a;
	int b;
	//Default constructor
	ThisKeyword4()
	{
	a = 10;
	b = 20;
	}
	//Method that returns current class instance
	ThisKeyword4 get()
	{
	return this;
	}
	//Displaying value of variables a and b
	void display()
	{
	System.out.println("a = " + a + " b = " + b);
	}
	public static void main(String[] args)
	{
	ThisKeyword4 object = new ThisKeyword4();
	object.get().display();
	}
}


