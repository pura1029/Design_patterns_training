package com.adapter;

import com.newcomponent.AcmeClass;
import com.oldcomponent.AceInterface;

public class AppAdapter2 implements AceInterface {

	AcmeClass acmeClass;
	String fullName;

	public AppAdapter2(AcmeClass acmeClass) {
		super();
		this.acmeClass = acmeClass;
		this.fullName = acmeClass.getFirstName() + " " + acmeClass.getLastName();
	}

	@Override
	public void setName(String name) {
		this.fullName = name;
	}

	@Override
	public String getName() {
		return fullName;
	}

}
