package com.capgrmini.javagenerics;

class Data1
{
	private float str;

	public Data1(float str) {
		this.str = str;
			
	}

	public float getStr() {
		return str;
	}

	
	}
public class ObjectDemo {
	public static void main(String[] args) {
		   
		Data1 obj1=new Data1(1.5f);
		float out = obj1.getStr();
		System.out.println(out);
		
		
	}
	

}
