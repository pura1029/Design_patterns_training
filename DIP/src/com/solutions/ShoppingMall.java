package com.solutions;

import com.solutions.upi.Phonepay;
import com.solutions.upi.UPIPayment;

//Dependency Inversion Principle
public class ShoppingMall {

	private BankCard bankCard;
	private UPIPayment upiPayment;

	public ShoppingMall(BankCard bankCard) {
		super();
		this.bankCard = bankCard;
	}

	public ShoppingMall(UPIPayment upiPayment) {
		super();
		this.upiPayment = upiPayment;
	}

	public void doPurchaseSomething(long amount) {
		bankCard.doTransactions(amount);
	}

	public void doPurchaseUsingUpi(long amount) {
		upiPayment.doTransactions(amount);
	}

	public static void main(String[] args) {

		BankCard bankCard = new DebitCard();
		ShoppingMall mall = new ShoppingMall(bankCard);
		mall.doPurchaseSomething(45000);
		UPIPayment upiPayment = new Phonepay();
		ShoppingMall upiMall = new ShoppingMall(upiPayment);
		upiMall.doPurchaseUsingUpi(263);
	}
}
