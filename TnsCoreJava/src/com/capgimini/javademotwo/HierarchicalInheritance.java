//A program that demonstrates hierarchical inheritance in java
package com.capgimini.javademotwo;
	class One1
	{
	void dispOne()
		{
			System.out.println("One");
		}
	}
	class Two2 extends One1
	{
		void dispTwo()
		{
			System.out.println("Two");
		}
	}
	class Three extends One1
	{
		void dispThree()
		{
			System.out.println("Three");
		}
	}
	class Four extends One1
	{
		void dispFour()
		{
			System.out.println("Four");
		}
}	
public class HierarchicalInheritance {
	public static void main(String[] args)
	{
	//create object using new keyword	
	Four obj1= new Four();
	obj1.dispOne();
	obj1.dispFour();
	//create object using new keyword
	Three obj2 = new Three();
	obj2.dispOne();
	obj2.dispThree();
	//create object using new keyword
	Two2 obj3 = new Two2();
	obj3.dispOne();
	obj3.dispTwo();;
	}
	
}
