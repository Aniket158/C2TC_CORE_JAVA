// A program that demonstrates working of this keyword in java
package com.capgimini.javademotwo;

public class ThisKeyword2 {
	int num;
	ThisKeyword2()
	{
	}
	ThisKeyword2(int num)
	{
	this.num = num;
	}
	public static void main(String[] args)
	{
	ThisKeyword2 obj = new ThisKeyword2(5);
	System.out.println("Num value : "+obj.num);
	}
}

