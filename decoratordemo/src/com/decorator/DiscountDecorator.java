package com.decorator;

public class DiscountDecorator extends Saledecorator {

	Sale sale;

	public DiscountDecorator(Sale sale) {
		super();
		this.sale = sale;
	}

	@Override
	public int getNop() {
		return sale.getNop();
	}

	@Override
	public double getTotal() {
		return sale.getTotal() - (5.0 / 100.0 * sale.getTotal());
	}
}
