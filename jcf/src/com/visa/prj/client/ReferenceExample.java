package com.visa.prj.client;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class ReferenceExample {
	
	public static void main(String [] args) {
		Map<String,Double> map= new HashMap<>();
		String s= new String("hello");
		map.put(s, 555.55);
		s=null;
		System.out.println(map.get("hello"));
		WeakReference<String> wr = new WeakReference <String>(new String("Hello"));
		System.out.println(wr.get());
		
		System.gc();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(wr.get());
	}
	
	
	
	
	
	
	
	

}
