package com.sl;

import java.util.ArrayList;
import java.util.List;

public class ServiceCache {
	private static ServiceCache serviceCache;
	private List<BusinessInterface> businessService;

	static {
		serviceCache = new ServiceCache();
	}

	private ServiceCache() {
		businessService = new ArrayList<>();
	}

	public static ServiceCache getInstance() {
		return serviceCache;
	}

	public BusinessInterface getBusinessService(String sname) {

		for (BusinessInterface businessService : businessService) {
			if (businessService.getServiceName().equalsIgnoreCase(sname)) {
				System.out.println("Returning from cache...." + sname);
				return businessService;
			}
		}
		return null;

	}

	public void addBusinessService(BusinessInterface newBusiness) {
		boolean exists = false;
		for (BusinessInterface businessInterface : businessService) {
			if (businessInterface.getServiceName().equalsIgnoreCase(newBusiness.getServiceName())) {
				exists = true;
			}
		}
		if (!exists) {
			businessService.add(newBusiness);
		}
	}

}
