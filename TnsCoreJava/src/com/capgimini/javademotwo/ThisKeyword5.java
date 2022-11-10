// A program that demonstrates working of this keyword in java
package com.capgimini.javademotwo;

public class ThisKeyword5 {
	int rollno;
	String name,course;
	float fee;
	ThisKeyword5(int rollno,String name,String course)
	{
	this.rollno=rollno;
	this.name=name;
	this.course=course;
	}
	ThisKeyword5(int rollno,String name,String course,float fee)
	{
	this(rollno,name,course);//reusing constructor
	this.fee=fee;
	}
	void display()
	{
	System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
	public static void main(String args[])
	{
	ThisKeyword5 s1=new ThisKeyword5(111,"ankit","java");
	ThisKeyword5 s2=new ThisKeyword5(112,"sumit","java",6000f);
	s1.display();
	s2.display();
	}

}
