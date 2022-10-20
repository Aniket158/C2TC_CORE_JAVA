//A program that demonstrates use of break and continue.
package com.capgemini.javademo;

public class BreakContinue {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
        {
       	 if(i == 1)
       	 {
       		 continue;   // break;
       	 }
       	 System.out.println(i);
        }

	}

}
