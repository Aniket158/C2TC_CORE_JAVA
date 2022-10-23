//A program that demonstrates the objects and classes in java.

package com.capgimini.javademotwo;
//this class file is attached with class file Demo.
public class ObjectsClassesTwo {

		public static void main(String[] args) {
			//creating an object using new keyword 
			Demo car = new Demo();
			car.setDoors ("closed");
			car.setSpeed (10);
			System.out.println(car.run());

		}

	}