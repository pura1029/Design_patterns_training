package com.solutions;

public class DebitCard  implements BankCard{

	public void doTransactions(long amount) {
		System.out.println("payment using Debit card");
	}
}
