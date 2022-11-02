//A program that demonstrates method overloading in java
package com.capgimini.javademotwo;

public class MethodOverloading {

		//overloading add().this add takes two int parameters
		void add(int x, int y)
		{
		System.out.println("Add is "+(x+y));
		}
		//overloading add().this add takes three int parameters
		void add(int x, int y, int z)
		{
		System.out.println("Add is "+(x+y+z));
		}
		public static void main(String[] args)
		{
		//create object using new keyword
		MethodOverloading obj = new MethodOverloading();
		obj.add(10, 9);
		obj.add(7, 2, 15);
		}
	}

