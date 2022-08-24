package com.decorator;

public class MemberDecorator extends Saledecorator {

	Sale sale;
	char memeberType;

	public MemberDecorator(Sale sale, char memeberType) {
		super();
		this.sale = sale;
		this.memeberType = memeberType;
	}

	@Override
	public int getNop() {
		return sale.getNop();
	}

	@Override
	public double getTotal() {

		switch (memeberType) {
		case 'P':
			return sale.getTotal() - (10.0 / 100.0 * sale.getTotal());
		case 'G':
			return sale.getTotal() - (5.0 / 100.0 * sale.getTotal());
		case 'S':
			return sale.getTotal() - (2.0 / 100.0 * sale.getTotal());
		default:
			return sale.getTotal();
		}
	}
}
