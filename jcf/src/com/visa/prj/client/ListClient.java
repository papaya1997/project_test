package com.visa.prj.client;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Iterator;

import entity.Product;

public class ListClient {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));
		Map<String,List<Product>> map= products.stream().collect(Collectors.groupingBy(p->p.getCategory()));
		map.forEach((k,v)->{
			System.out.println(k);
			v.forEach(System.out::println);
		});
		List <Product> list = new CopyOnWriteArrayList<>(products);
		//avoid this

		for(int i=0; i<products.size();i++) {
			Product p=products.get(i);
			System.out.println(p);
			//prodcuts.add(new Product());
		}
		
		System.out.println("****");
		
		Iterator<Product> iter = products.iterator();
		products.add(new Product()); //ConcurrentModifiedException
		while(iter.hasNext()) {
			Product p = iter.next();
			System.out.println(p);
		}
		
		System.out.println("*****");
		
		for(Product p: products) {
			//products.add(new Product());
			System.out.println(p);
		}
		Collections.sort(products);
			for(Product p: products) {
				System.out.println(p);
		}
		
		Collections.sort(products,(p1,p2) -> Double.compare(p1.getPrice()
	,p2.getPrice()));
		
	}
}
