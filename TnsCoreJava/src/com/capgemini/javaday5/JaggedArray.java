// A program that demonstrates jagged array in java
package com.capgemini.javaday5;

public class JaggedArray {
public static void main(String[] args) {

		
		int a[][]=new int [4][];  //declaration jagged array
		
	    a[0]=new int[3];
	    a[1]=new int[2];
	    a[2]=new int[4];
	    a[3]=new int[4];
	    
	    int count=0;
	    
	    
	    //initializing array
	    for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
	         a[i][j]=count++	;	
	        }
	        
				
			
		}
	    
	  //Display elements in array
		 for (int i=0;i<a.length;i++)
			{
				for (int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+" ");
		        }
				 System.out.println();

	}

}
}
