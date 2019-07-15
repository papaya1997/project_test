package com.visa.prj.client;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayClient {

	public static void main(String[] args) {
		String[] names = { "Calvin", "George", "Lee", "Angelina", "Brad" };
		int total = Arrays.stream(new int[]{ 1, 2, 3 })
				.filter(i ->i>= 2)
	.map(i ->i * 3)
	.sum();
		System.out.println(total);

		// Arrays.sort(names);
		/*
		 * Arrays.sort(names, new Comparator<String>() {
		 * 
		 * 	@Override public int compare(String o1, String o2) { 
		 * 		  	return o1.length() - o2.length(); 
		 * 	} 
		 * });
		 */

		Arrays.sort(names, (o1, o2) -> o1.length() - o2.length());

		for (String name : names) {
			System.out.println(name);
		}
	}

}
