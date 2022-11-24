package com.capgrmini.javagenerics;


import java.util.ArrayList;
import java.util.List;

class Demo1
{
	public <E>void printListData()
	{
		
	}
	
	public <E>void printArrayData(List<E> obj1 )
	{
		for(E i:obj1)
		{
			System.out.println(i);
		}
			
	}
}

public class Reusedemo {

	public static void main(String[] args) {
		
		
		List<Integer> object=new ArrayList<>();
		object.add(1);
		object.add(2);
		object.add(3);
		object.add(4);
		object.add(5);
		
		//System.out.println(object);
		
		Demo1 d1=new Demo1();
		d1.printArrayData(object);
		
		List<String> object1=new ArrayList<>();
		object1.add("Good_Morning");
		object1.add("Everyone");
		object1.add("Welcome to COETA");
		object1.add("My name is aniket");
		
		d1.printArrayData(object1);
		
		List<Float> object2=new ArrayList<>();
		object2.add(44.66f);
		object2.add(445.77f);
		
		
		
		d1.printArrayData(object2);
		

	}
}
