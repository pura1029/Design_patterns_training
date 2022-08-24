package com.sl;

public class ServiceLocator {

	public static BusinessInterface getBusinessInterface(String jndiname) {

		BusinessInterface businessInterface = ServiceCache.getInstance().getBusinessService(jndiname);

		if (businessInterface != null) {
			return businessInterface;
		}
		InitialContext context = new InitialContext();
		BusinessInterface businessInterface2 = (BusinessInterface) context.lookup(jndiname);
		ServiceCache.getInstance().addBusinessService(businessInterface2);
		return businessInterface2;
	}

}
