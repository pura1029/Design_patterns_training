package com.solutions.upi;

public class Gpay implements UPIPayment {

	@Override
	public void doTransactions(long amount) {
		System.out.println("payment using Gpay");
	}

}
