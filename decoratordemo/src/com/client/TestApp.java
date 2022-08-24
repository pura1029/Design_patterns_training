package com.client;

import com.decorator.BatchDecorator;
import com.decorator.DiscountDecorator;
import com.decorator.MemberDecorator;
import com.decorator.Sale;

public class TestApp {

	public static void main(String[] args) {

		Sale sale = new Sale(15, 2000);

		sale = new DiscountDecorator(sale);// 1900
		sale = new BatchDecorator(sale);// 1900-10=1890
		sale = new MemberDecorator(sale, 'P');// 1890-189=1701

		System.out.println(sale.getTotal());

	}

}
