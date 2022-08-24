package com.commands;

import java.util.ArrayList;

import com.db.ProductsDB;
import com.model.Product;


public class ListCommand implements Command{
	
	private ArrayList<Product> prd_list;
	

	public ArrayList<Product> getPrd_list() {
		return prd_list;
	}

	public void setPrd_list(ArrayList<Product> prd_list) {
		this.prd_list = prd_list;
		
	}
	
	

	
	
}
