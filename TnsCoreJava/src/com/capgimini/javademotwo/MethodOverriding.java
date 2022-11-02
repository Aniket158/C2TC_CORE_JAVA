// A program that demonstrates method overriding in java
package com.capgimini.javademotwo;

        class Super {
		void dispDemo()
			{
				System.out.println("Super Class");
			}
		}
		class subclass extends Super
		{
			// This method overrides dispDemo() of Parent
			@Override
			void dispDemo()
			{
				super.dispDemo();
				//System.out.println("Only Sub Class");
			}
		}
		public class MethodOverriding
		{
			public static void main(String[] args)
			{
				//create object using new keyword
				subclass obj = new subclass();
				obj.dispDemo();
			}
		}
