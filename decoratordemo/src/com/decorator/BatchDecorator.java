package com.decorator;

public class BatchDecorator extends Saledecorator {

	Sale sale;

	public BatchDecorator(Sale sale) {
		super();
		this.sale = sale;
	}

	@Override
	public int getNop() {
		return sale.getNop();
	}

	@Override
	public double getTotal() {

		if (this.getNop() > 10)
			return sale.getTotal() - 10;
		return sale.getTotal();
	}
}
