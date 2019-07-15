package entity;

import java.util.HashMap;
import java.util.Map;

public class task3 {

	public static void main(String[] args) {
		String[] str=("hey it is me me me ok ok is").split(" ");
		Map <String,Integer> mp=new HashMap<>();
		for(String s : str) {
			if(mp.get(s)==null) {
				mp.put(s, 1);
			}
			else {
				Integer n=mp.get(s);
				mp.put(s, n+1);
			}
		}
		mp.forEach((k,v)->{System.out.println(k+" = "+v);});

	}
	

}
