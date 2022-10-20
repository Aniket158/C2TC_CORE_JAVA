//A program that demonstrates the switch case in java (char).
package com.capgemini.javademo;

public class SwitchCase1 {

	public static void main(String[] args) {
		//declare variable of character type
		char x = 'F';
		switch (x) //switch case
		{
		case 'a' : 
		case 'A' : 
			System.out.println("The value of x is a");
			break;
		case 'b':
		case 'B' :
			System.out.println("The value of x is b");
			break;
		case 'c':
		case 'C' :	
			System.out.println("The value of x is c");
			break;
		default:
	System.out.println("The value of x is other than a,b,c");
			break;
		}

	}

}
