package com.oldcomponent;

public class AceClass implements AceInterface {

	String name;

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getName() {
		return name;
	}

}
