package com.adapter;

import com.newcomponent.AcmeInterface;
import com.oldcomponent.AceClass;

public class AppAdapter implements AcmeInterface {

	AceClass aceObject;
	String firstName;
	String lastName;

	@Override
	public void setFirstName(String fname) {
		this.firstName = fname;
	}

	public AppAdapter(AceClass aceObject) {

		this.aceObject = aceObject;
		firstName = aceObject.getName().split(" ")[0];
		lastName = aceObject.getName().split(" ")[1];
	}

	@Override
	public void setLastName(String lName) {
		this.lastName = lName;
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
