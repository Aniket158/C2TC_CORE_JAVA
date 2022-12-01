package com.capgrmini.javagenerics;


interface Lambda1
{
	public void demo();
}

public class Lambda2  {

	public static void main(String[] args) {
		
		 new Thread ( ()->{ System.out.println("This is my thread1 ..running");}).start();

}
}