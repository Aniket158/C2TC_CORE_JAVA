// Java Program to Illustrate Abstract Class
// Can contain Constructors

package com.capgimini.javademotwo;

   //class 1 abstract class
	abstract class BaseDemo
	{
	BaseDemo()
	{
		System.out.println("Base Constructor Called");
	}
	//abstract method inside class1
	abstract void fun();
	}
	//class2
	class DerivedOne extends BaseDemo
	{
	//constructor of class2
	DerivedOne()
	{
		System.out.println("Derived Constructor Called");
	}
	//method of class2
	void fun()
	{
		System.out.println("Derived fun() called");
	}
	}
	class AbstractClassMethod2
	{
	public static void main(String args[])
	{
	//create object using new keyword
	DerivedOne d = new DerivedOne();
	d.fun();
	}
	}
