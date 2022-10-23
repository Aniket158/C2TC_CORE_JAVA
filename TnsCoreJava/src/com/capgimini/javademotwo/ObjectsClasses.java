//A program that demonstrates the objects and classes in java
package com.capgimini.javademotwo;

class CarDemo{
	//create variables of string type
	private String doors;
	private String engine;
	private String driver;
	//create variable of integer type
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
public class ObjectsClasses {
	public static void main(String[] args) {
	//creating an object using new keyword 	
	CarDemo car = new CarDemo();
	car.setSpeed (10);
	System.out.println(car.getSpeed());
	}
   
}
