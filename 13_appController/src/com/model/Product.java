package com.model;

public class Product {

	private int productid;
	private String productname;
	private String manfacturer ;
	private int quantity ;
	private double price;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public Product(int productid, int quantity) {
		super();
		this.productid = productid;
		this.quantity = quantity;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getManfacturer() {
		return manfacturer;
	}
	public void setManfacturer(String manfacturer) {
		this.manfacturer = manfacturer;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int productid, String productname, String manfacturer,
			int quantity,double price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.manfacturer = manfacturer;
		this.quantity = quantity;
		this.price=price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
