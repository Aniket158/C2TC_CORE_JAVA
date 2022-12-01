package com.capgrmini.javagenerics;

interface Lambda 
{
	public void demo();
	
}

public class Lambda1 {

	public static void main(String[] args) {
		Lambda obj=()->
		{System.out.println("Welcome to COETA, Akola");
		System.out.println("Welcome to COETA, Akola");
		System.out.println("Welcome to COETA, Akola");
		System.out.println("Welcome to COETA, Akola");
		};
		obj.demo();
}
}