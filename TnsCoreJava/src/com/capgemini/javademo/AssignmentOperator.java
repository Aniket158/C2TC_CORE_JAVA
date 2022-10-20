//A program that demonstrates the assignment operator in
package com.capgemini.javademo;

public class AssignmentOperator {

	public static void main(String[] args) {
		//declare variable of integer type
		int x = 4;
		//x += 5; // x = x + 5
		//x -= 5; // x = x - 5
		//x *= 5; // x = x * 5
		//x /= 4; // x = x / 4
		x %= 5;   // x = x % 5
		System.out.println(x);

	}

}
