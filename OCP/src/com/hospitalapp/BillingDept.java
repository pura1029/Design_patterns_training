package com.hospitalapp;

public class BillingDept extends Employee {

	public BillingDept(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("BillingDept in action");
	}

	@Override
	public void performDuties() {
		initiatedBill();
		processBill();
	}

	private void initiatedBill() {
		System.out.println("Bill initiated");
	}

	private void processBill() {
		System.out.println("Bill processed");
	}
}
