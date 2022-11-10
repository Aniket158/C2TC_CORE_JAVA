// A program that demonstrates static class in java
package com.capgemini.javademo3;

public class StaticClass {
	private static String str = "TNS Java Sessions";
	static class MyNestedClass
	{
	public void disp()
	{
	System.out.println(str);
	}
	}
	public static void main(String args[])
	{
		StaticClass.MyNestedClass obj = new StaticClass.MyNestedClass();
	    obj.disp();
	}
}
