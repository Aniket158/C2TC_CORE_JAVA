//A program that demonstrates single inheritance in java
package com.capgimini.javademotwo;

	class One
	{
	void displ()
	{
	System.out.println("One");
	}
	}
	class Two extends One
	{
	void disp2()
	{
	System.out.println("Two");
	}
}

	public class  SingleInheritance 
	{
	 public static void main(String[] args)
	 {
	//creating an object using new keyword 
	 Two obj = new Two();
	 obj.displ();
	 obj.disp2();
	 }
}	

