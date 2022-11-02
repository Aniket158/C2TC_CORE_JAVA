//A program that demonstrates the encapsulation in java.
package com.capgimini.javademotwo;

	public class Encapsulation
	{
	//create variable of string type.	
	private String name;
	public String getName()
	{
	return name;
	}
	public void setName(String name)
	{
	this.name=name;
	}
	}
	class  Test
	{
	public static void main(String[] args)
	{
	//creating an object using new keyword
	Encapsulation s=new Encapsulation();
	s.setName("vikas");
	System.out.println(s.getName());
	}
	}