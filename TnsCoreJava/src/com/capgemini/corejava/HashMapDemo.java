package com.capgemini.corejava;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {

		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(10, "Swapnil");
		hm.put(11, "Ravi");
		hm.put(12, "Megha");
		hm.put(13, "Jahnu");
		hm.put(14, "Vaibhav");
		//hm.put(null, "Swarup");
		hm.put(null, null);
		hm.put(14, "Swarup");
		hm.put(15, null);
		
	System.out.println(hm);
	
	
	System.out.println(hm.size());
	System.out.println(hm.get(14));
	System.out.println(hm.remove(12));
	System.out.println(hm);
	System.out.println(hm.containsValue("Megha"));
	System.out.println(hm.containsKey(12));
	
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	

	}

}
