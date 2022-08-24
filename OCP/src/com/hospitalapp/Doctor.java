package com.hospitalapp;

public class Doctor  extends Employee{

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		 System.out.println("Doctor in action");
	}
	
	private void diagnosePatients() {
		System.out.println("checking patient");
	}

	private void prescribeMedicine() {
		System.out.println("prescribing Medicine");
	}
	
	public void performDuties() {
		diagnosePatients();
		prescribeMedicine();
	}

}
