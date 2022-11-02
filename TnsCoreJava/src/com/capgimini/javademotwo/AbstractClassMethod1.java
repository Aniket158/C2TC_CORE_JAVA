//Java Program to Illustrate
// that an instance of Abstract
// Class can not be created
package com.capgimini.javademotwo;
//class 1 abstract class
abstract class Base//abstract keyword
{
	abstract void fun();
}
//class 2
class Derived extends Base
{
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}
//class 3
class AbstractClassMethod1
{
	public static void main(String args[])
	{
		// Uncommenting the following line will cause compiler error 
		//as the line tries to create an instance of abstract class.
		// Base b = new Base();
		
		// We can have references of Base type.
		Base b = new Derived();//create object using new keyword
		b.fun();
}
}

