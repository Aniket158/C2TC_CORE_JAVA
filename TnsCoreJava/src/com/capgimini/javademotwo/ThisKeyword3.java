// A program that demonstrates working of this keyword in java
package com.capgimini.javademotwo;

public class ThisKeyword3 {
	void function1(ThisKeyword3 obj)
	{
	System.out.println("Function 1 invoked");
	}
	void function2()
	{
	function1(this);
	}
	public static void main(String[] args)
	{
	ThisKeyword3 obj = new ThisKeyword3();
	obj.function2();
	}

}
