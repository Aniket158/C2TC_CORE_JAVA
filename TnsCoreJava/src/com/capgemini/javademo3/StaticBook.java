// A program that demonstrates static books in java
package com.capgemini.javademo3;

public class StaticBook {
	static
	{
	System.out.println("static block is invoked");
	}
	static int calculateCube(int side)
	{
	return (side*side*side);
	}
	public static void main(String[] args) {
	//System.out.println("Cube value of 5 is: "+calculateCube(5));
	System.out.println("Cube value of 5 is: "+StaticBook.calculateCube(5));
	}

}
