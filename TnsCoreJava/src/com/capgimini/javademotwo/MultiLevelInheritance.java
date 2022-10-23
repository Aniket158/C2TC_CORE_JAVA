//A program that demonstrates multi-level inheritance in java
package com.capgimini.javademotwo;

class demoOne
{
	void displ()
	{
		System.out.println("One");
	}
}
class demoTwo extends demoOne
{
	void disp2()
	{
		System.out.println("Two");
	}
}
class demoThree extends demoTwo
{
	void disp3()
	{
		System.out.println("Three");
	}
}
class demoFour extends demoThree
{
	void disp4()
	{
		System.out.println("Four");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
	//create object using new keyword	
	demoFour obj1 = new demoFour();
	obj1.displ();
	obj1.disp2();
	obj1.disp3();
	obj1.disp4();
	}

}
