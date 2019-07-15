package entity;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class task2 {

	public static void main(String[] args) {
		
		Product p=new Product(645,"Hp Laptop",135000.00,"computer",100);
			
		Map <String, Object>info= storeInfo(p);
		info.forEach((k,v)->{System.out.println(k+":"+v);});
		
	}

	private static Map<String, Object> storeInfo(Product p) {
		Map<String, Object> mp=new HashMap<>();
		Method [] methods=Product.class.getMethods();
		for(Method m : methods) {
			if(m.getName().startsWith("get")) {
				try {
					Object ret=m.invoke(p);
					mp.put(m.getName().substring(3),ret);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		return mp;
	}

}
