package com.capgemini.javademo3;

public class StaticVariable {
	int side;
	static int objectCount=0;
	StaticVariable()
	{
	objectCount++;
	}
	StaticVariable(int x)
	{
	side=x;
	objectCount++;
	}
	public static void main(String[] args)
	{
	StaticVariable c1=new StaticVariable();
	StaticVariable c2=new StaticVariable(5);
	StaticVariable c3=new StaticVariable(8);
	StaticVariable c4=new StaticVariable(10);
	StaticVariable c5=new StaticVariable(11);
	System.out.println("Number of Cube Objects: "+objectCount);
	}

}
