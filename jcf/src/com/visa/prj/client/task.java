package com.visa.prj.client;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entity.Product;

public class task {

	public static void main(String[] args) {
		String[] str= args;
	
		Set <String> uniSet = new HashSet<>();
		Set <String> dupSet = new HashSet<>();
		for (String word: str) {
			if(!uniSet.add(word)) {
				uniSet.remove(word);
				dupSet.add(word);
			}
		}
		for(String w: uniSet) {
			System.out.println(w);
		}
		System.out.println("+++");
		for(String w1:dupSet) {
			System.out.println(w1);
		}

	}

}
