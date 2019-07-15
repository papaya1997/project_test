package com.visa.prj.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import entity.Product;

public class StreamExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));
		
		products.stream().filter(p -> p.getCategory().contentEquals("mobile")).forEach(p->System.out.println(p));
		
		System.out.println("*****");
		System.out.println("print mobile names");
		
		products.stream().filter(p->p.getCategory().equals("mobile")).map(p->p.getName()).forEach(name-> System.out.println(name));
		
		System.out.println("****");
		//Stream <product> mobileStream = products.parallelStream().filter(p->p.getCategory().equals("mobile"));
		
		System.out.println("***");
		products.stream().filter(p->p.getCategory().equals("mobile")).forEach(System.out :: println);
	}

}
