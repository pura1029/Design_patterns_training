package com.main;

import com.clonables.Book;
import com.clonables.DVD;
import com.clonables.ElectricAppliances;
import com.clonables.KitchenAppliances;
import com.clonefactory.ProductCache;

public class TestApp {

	public static void main(String[] args) {
		ProductCache.loadCache();

		Book cloned = (Book) ProductCache.getproduct("b231");
		System.out.println(cloned.getDescription());
		System.out.println(cloned.hashCode());

		Book cloned3 = (Book) ProductCache.getproduct("b231");
		System.out.println(cloned3.getDescription());
		System.out.println(cloned3.hashCode());

		DVD cloned2 = (DVD) ProductCache.getproduct("201");
		System.out.println(cloned2.getDescription());

		KitchenAppliances k1 = (KitchenAppliances) ProductCache.getproduct("k231");
		System.out.println(k1.getDescription());
		ElectricAppliances e1 = (ElectricAppliances) ProductCache.getproduct("e231");
		System.out.println(e1.getDescription());
	}

}
