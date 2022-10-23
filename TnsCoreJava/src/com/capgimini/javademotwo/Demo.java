//A program that demonstrates the objects and classes in java.
package com.capgimini.javademotwo;
//this class file  is attached with class file ObjectsClassesTwo.
public class Demo {
	//create variable of string type.
	private String doors;
	//create variable of integer type
	private int speed;
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String run(){
		if(doors.equals("closed") && speed >0)
		{
			return "running";
		}
		else
			return "not running";
	}
}
