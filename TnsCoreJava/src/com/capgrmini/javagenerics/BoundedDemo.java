package com.capgrmini.javagenerics;

class Data_1<N extends String,S extends String>
{
	private N Number;
	private S StdName ;
	public Data_1(N Number, S StdName) {
		this.Number = Number;
		this.StdName = StdName;
	}
	public N getKey() {
		return Number;
	}
	public S getValue() {
		return StdName;
	}
	@Override
	public String toString() {
		return "Datas [key=" + Number + ", value=" + StdName + "]";
	}
	
	public <R extends Integer,N extends String>void display(R Roll_No,N Name)
	{
	System.out.println("Roll No. is:"+Roll_No+" "+"Student name is "+Name);
	}

}


public class BoundedDemo {

	public static void main(String[] args) {
		
		
		Data_1<String,String> obj=new Data_1<String,String>("Samir","abc");
		//System.out.println("Key is"+obj.getKey()+" Value is "+obj.getValue());
		
		obj.display(10,"Pavan");
		
		
	}

}
