// Java Program to Illustrate Abstract classes
// Can also have Final Methods
package com.capgimini.javademotwo;

	abstract class BaseTwo
	{
	final void fun()
	{
	System.out.println("Derived fun() called");
	}
	}
	class DerivedThree extends BaseTwo
	{
	}
	class AbstractClassMethod4
	{
	public static void main(String args[])
	{
	//create object using new keyword
	BaseTwo b = new DerivedThree();
	b.fun();
	}
	}
