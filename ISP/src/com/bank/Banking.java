package com.bank;
//Interface segregation principle. 
public interface Banking {

	void sellMF();
	void sellInsurance();
	void openAccount();
	void giveLoan();
}
