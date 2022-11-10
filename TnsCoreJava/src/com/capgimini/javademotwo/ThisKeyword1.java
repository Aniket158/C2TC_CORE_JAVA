// A program that demonstrates working of this keyword in java
package com.capgimini.javademotwo;

public class ThisKeyword1 {
	int num;
	public void setNum(int num)
	{
	this.num = num;
	}
	public static void main(String[] args)
	{
	ThisKeyword1 obj = new ThisKeyword1();
	obj.setNum(5);
	System.out.println("Num value : "+obj.num);
	}
}

