package com.decorator;

public class Sale {

	public Sale() {

	}

	private int nop;
	private double saleAmount;

	public Sale(int nop, double saleAmount) {
		super();
		this.nop = nop;
		this.saleAmount = saleAmount;
	}

	public int getNop() {
		return nop;
	}

	public void setNop(int nop) {
		this.nop = nop;
	}

	public double getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(double saleAmount) {
		this.saleAmount = saleAmount;
	}

	public double getTotal() {
		return saleAmount;
	}
}
