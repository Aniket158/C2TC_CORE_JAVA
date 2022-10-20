//A program that demonstrates the nested loops in java.
package com.capgemini.javademo;

public class NestedLoops {

	public static void main(String[] args) {
		//for loop
		for(int i=1; i<=10; i++)
		{
			//for loop in for loop
			for(int j=1; j<=10; j++)
			{
	        System.out.println("Value of i:"+i+" and value of j:"+j);
			}
			System.out.println("********");
		}

	}

}
