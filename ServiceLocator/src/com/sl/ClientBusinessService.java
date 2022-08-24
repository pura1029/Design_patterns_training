package com.sl;

public class ClientBusinessService implements BusinessInterface {

	@Override
	public String getServiceName() {
		return "Client";
	}

	@Override
	public void executeService() {
		System.out.println("Calling business services for client ");
	}
}
