package com.newcomponent;

public class AcmeClass implements AcmeInterface {
	String firstName;
	String lastName;

	@Override
	public void setFirstName(String fname) {
		firstName = fname;

	}

	@Override
	public void setLastName(String lName) {
		lastName = lName;

	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

}
