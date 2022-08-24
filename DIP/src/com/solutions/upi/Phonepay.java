package com.solutions.upi;

public class Phonepay implements UPIPayment {

	@Override
	public void doTransactions(long amount) {
		System.out.println("payment using Phonepay");
	}

}
