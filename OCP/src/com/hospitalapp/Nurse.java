package com.hospitalapp;

public class Nurse extends Employee {

	public Nurse(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse in Action");
		 
	}
	private void checkVitalSigns() {
		System.out.println("checking Vitals");
	}
	private void drawBlood() {
		System.out.println("drawing blood");
	}
	private void cleanPatientArea() {
		System.out.println("cleaning Patient Area");
	}
	public void performDuties() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();
	}

}
