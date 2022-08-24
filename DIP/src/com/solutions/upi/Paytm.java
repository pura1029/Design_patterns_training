package com.solutions.upi;

public class Paytm implements UPIPayment {

	@Override
	public void doTransactions(long amount) {
		System.out.println("payment using Paytm");
	}

}
