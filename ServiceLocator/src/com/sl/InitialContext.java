package com.sl;

public class InitialContext {

	public Object lookup(String jndiName) {

		if (jndiName.equalsIgnoreCase("operation")) {

			System.out.println("looking up for creating new operation service");
			return new OperationalBS();
		} else if (jndiName.equalsIgnoreCase("client")) {
			System.out.println("looking up for creating new client service");
			return new ClientBusinessService();
		}
		return null;

	}
}