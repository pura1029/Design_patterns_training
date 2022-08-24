package com.sl;

public class OperationalBS implements BusinessInterface {

	@Override
	public String getServiceName() {
		return "Operation";
	}

	@Override
	public void executeService() {
		System.out.println("Calling business services for operation team");

	}

}
