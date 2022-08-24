package com.hospitalapp;

//Open and close Principle
public class EmergencyRoomProcess {
	public static void main(String[] args) {

		HospitalManagement hospitalManagement = new HospitalManagement();
		Employee sam = new Nurse(101, "PEGGY", "emergency", true);
		hospitalManagement.callUpon(sam);
		Employee suzan = new Doctor(2001, "Suzan", "emergency", true);
		hospitalManagement.callUpon(suzan);
		Employee ram = new BillingDept(232, "Ram", "billing", true);
		hospitalManagement.callUpon(ram);
	}
}