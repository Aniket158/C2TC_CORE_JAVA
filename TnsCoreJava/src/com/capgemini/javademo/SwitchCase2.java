//A program that demonstrates the switch case in java (string).
package com.capgemini.javademo;

public class SwitchCase2 {

	public static void main(String[] args) {
		//declare variable of string type
		String name = "te";

		switch (name.toLowerCase()) //switch case
		{
		case "author":
			System.out.println("Vikas");
			break;
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		case "editor":
			System.out.println("Vishnu & Krishna");
			break;
		default:
			System.out.println("Invalid entry");
			break;

		}
	}
}
