package com.pack;

public class MainApp {

	public static void main(String[] args) {

		Employee emp = new Employee.Builder("bob", "bob@mail.com").fname("bob").lName("max").city("BLR").build();
		System.out.println(emp);

	}

}
