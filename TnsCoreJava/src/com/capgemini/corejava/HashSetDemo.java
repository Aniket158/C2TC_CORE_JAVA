package com.capgemini.corejava;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		
		Set<String> obj=new HashSet<>();
	
		obj.add("Radha");
		obj.add("Pratik");
		obj.add("prachi");
		obj.add("Shrihari");
		obj.add("Vilas");
		obj.add(null);
		
		Set<String> obj1=new HashSet<>();
		
		obj1.add("Radha");
		obj1.add("Pratik");
		obj1.add("Prachi");
		obj1.add("Shrihari");
		
		obj1.add(null);
	
		System.out.println(obj);
		
		System.out.println(obj.size());
		System.out.println(obj.contains("Prachi"));
		System.out.println(obj.getClass());
		System.out.println(obj.isEmpty());
		System.out.println(obj.equals(obj1));


	

	}

}
