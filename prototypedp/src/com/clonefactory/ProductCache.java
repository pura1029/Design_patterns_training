package com.clonefactory;

import java.util.HashMap;
import java.util.Map;

import com.clonables.Book;
import com.clonables.DVD;
import com.clonables.ElectricAppliances;
import com.clonables.KitchenAppliances;
import com.clonables.Product;

public class ProductCache {

	private static Map<String, Product> productMap = new HashMap<>();

	public static Product getproduct(String pcode) {

		Product cachedProduct = productMap.get(pcode);
		return (Product) cachedProduct.clone();
	}

	public static void loadCache() {
		Book b1 = new Book();
		b1.setpCode("b231");
		b1.setDescription("my fav book");
		b1.setNop(103);

		DVD dvd = new DVD();
		dvd.setpCode("201");
		dvd.setDescription("Popular movie");
		dvd.setDuration(2);
		
		KitchenAppliances k1 = new KitchenAppliances();
		k1.setpCode("k231");
		k1.setDescription("gas stove");
		k1.setType("stove");
		
		ElectricAppliances e1 = new ElectricAppliances();
		e1.setpCode("e231");
		e1.setDescription("LG tv");
		e1.setType("TV");

		productMap.put(b1.getpCode(), b1);
		productMap.put(k1.getpCode(), k1);
		productMap.put(e1.getpCode(), e1);
		productMap.put(dvd.getpCode(), dvd);
	}

}
