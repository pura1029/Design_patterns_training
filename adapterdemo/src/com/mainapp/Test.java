package com.mainapp;

import com.adapter.AppAdapter;
import com.adapter.AppAdapter2;
import com.newcomponent.AcmeClass;
import com.oldcomponent.AceClass;

public class Test {

	public static void main(String[] args) {

		AceClass aceClass = new AceClass();
		aceClass.setName("Amarjeet Singh");

		AppAdapter adapter = new AppAdapter(aceClass);
		System.out.println(adapter.getFirstName());
		System.out.println(adapter.getLastName());

		AcmeClass acmeClass = new AcmeClass();
		acmeClass.setFirstName("Ram");
		acmeClass.setLastName("Singh");

		AppAdapter2 appAdapter2 = new AppAdapter2(acmeClass);
		System.out.println(appAdapter2.getName());

	}

}
