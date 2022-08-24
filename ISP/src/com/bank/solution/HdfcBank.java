package com.bank.solution;

import com.bank.Banking;

public class HdfcBank implements Banking, Insurance, MutualFund {

	@Override
	public void sellMF() {
		System.out.println("sell MF");

	}

	@Override
	public void sellInsurance() {
		System.out.println("sell Insurance");

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
