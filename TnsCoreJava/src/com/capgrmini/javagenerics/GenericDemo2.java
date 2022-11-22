package com.capgrmini.javagenerics;

import java.util.LinkedList;
import java.util.List;

class Test<T>
{
	
	private T myvariable;

	public Test(T myvariable) {
		this.myvariable = myvariable;
	}

	public T getMyvariable() {
		return myvariable;
	}

	@Override
	public String toString() {
		return "Test [myvariable=" + myvariable + "]";
	}
	
	}

public class GenericDemo2 {

	public static void main(String[] args) {
		
		List<Test<Object>> obj=new LinkedList<>();
		
		obj.add(new Test<Object>("Wellcome to Akola"));
		obj.add(new Test<Object>("Wellcome to COETA"));
		obj.add(new Test<Object>(7));
		obj.add(new Test<Object>(16.5f));
		obj.add(new Test<Object>('T'));
		obj.add(new Test<Object>(12.66));
		
		
		System.out.println(obj);

		

	}

}
