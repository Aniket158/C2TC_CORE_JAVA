//A program that demonstrates the for loop.
package com.capgemini.javademo;

public class ForLoop1 {

	public static void main(String[] args) {
		//declare variable of integer type 
		int number = 8;
		//declare variable of boolean type
		boolean isPrime = true;
		for(int i = 2; i < number/2; i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime == true)
		{
System.out.println("The number is a prime number");
		}
		else
		{
System.out.println("The number is not a prime number");
		}

	}

}
