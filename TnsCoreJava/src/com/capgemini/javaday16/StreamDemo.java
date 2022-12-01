package com.capgemini.javaday16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		
		List<Integer> list=new ArrayList<>();
		
		list.add(2);
		list.add(17);
		list.add(38);
		list.add(45);
		list.add(66);
		list.add(79);
		list.add(84);
		list.add(97);
		list.add(294);
		list.add(599);
		
				
		//without Stream API
		
		List<Integer> listEven=new ArrayList<>();
		for(Integer i:list)
		{
			if(i % 2==0)
			{
				listEven.add(i);
			}
		}
		System.out.println("Original List:"+list);
		System.out.println("Processed List:"+listEven);
}
}
