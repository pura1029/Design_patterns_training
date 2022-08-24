package com.bank.solution;

public class PnbBank implements Banking, MutualFund {

	@Override
	public void sellMF() {
		System.out.println("sell MF");

	}

	@Override
	public void openAccount() {
		System.out.println("open Account");

	}

	@Override
	public void giveLoan() {
		System.out.println("give Loan");

	}

}
