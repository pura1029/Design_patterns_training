package com.sl;

public class ClientMain {

	public static void main(String[] args) {

		BusinessInterface businessInterface = ServiceLocator.getBusinessInterface("operation");

		businessInterface.executeService();
		businessInterface = ServiceLocator.getBusinessInterface("client");
		businessInterface.executeService();
		
		BusinessInterface businessInterface1 = ServiceLocator.getBusinessInterface("operation");
		businessInterface1.executeService();
	}

}
