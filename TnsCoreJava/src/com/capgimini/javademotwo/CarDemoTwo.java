//A program that demonstrates the constructors in java.
package com.capgimini.javademotwo;
//this class file is attached with class file Constructors.
public class CarDemoTwo {
	//create variables of string type
	private String doors;
	//create variables of integer type
	private int speed;
	//constructor of the class
	public CarDemoTwo()
	{
		doors = "opened";
		speed = 0;
	}
	//constructor of the class
	public CarDemoTwo (String doors, int speed)
	{
		this.doors =doors;
		this.speed =speed;
	}
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
	public String run() {
		if(doors.equals("closed") && speed >0 ){
			return "running";
		}else {
			return "not running";
		}
	}		

}
