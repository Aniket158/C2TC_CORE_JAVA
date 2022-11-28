package com.capgrmini.javagenerics;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


	class Details
	{
		private String name;

		public Details(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Details [name=" + name + "]";
		}
		
		}

	public class CompareDemo {

		public static void main(String[] args) {
			List<Details> list=new ArrayList<>();
			list.add(new Details("Saniya"));
			list.add(new Details("Renuka"));
			list.add(new Details("Bhushan"));
			list.add(new Details("Anu"));
			list.add(new Details("Aniket"));
			list.add(new Details("Aman"));

					
			
			Collections.sort(list,(Details o1,Details o2)->{return o1.getName().compareTo(o2.getName());});
			
			for (Details Details:list)
			{
				System.out.println(Details.getName());
			}
		}
	}