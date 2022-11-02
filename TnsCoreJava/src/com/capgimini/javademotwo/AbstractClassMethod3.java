// Java Program to illustrate Abstract class
// Without any abstract method

package com.capgimini.javademotwo;
	
	abstract class BaseOne
	{
	void fun()
	{
		System.out.println("Base fun() called");
	}
	}
	class DerivedTwo extends BaseOne
	{
		//This class only inherits the Base 
		//class methods and properties
	}
	class AbstractClassMethod3 {
	public static void main(String args[])
	{
	//create object using new keyword
	DerivedTwo d = new DerivedTwo();
	d.fun();
	}
	}