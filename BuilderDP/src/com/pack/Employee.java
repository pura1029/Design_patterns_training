package com.pack;

public class Employee {

	private String userName; // required
	private String email; // required
	private String fname;
	private String lName;
	private String address;
	private String city;

	private Employee(Builder builder) {
		this.userName = builder.userName;
		this.email = builder.email;
		this.fname = builder.fname;
		this.address = builder.address;
		this.lName = builder.lName;
		this.city = builder.city;
	}

	@Override
	public String toString() {
		return "Employee [userName=" + userName + ", email=" + email + ", fname=" + fname + ", lName=" + lName
				+ ", address=" + address + ", city=" + city + "]";
	}

	public static class Builder {

		private String userName;
		private String email;
		private String fname;
		private String lName;
		private String address;
		private String city;

		public Builder(String userName, String email) {
			super();
			this.userName = userName;
			this.email = email;
		}

		public Builder fname(String value) {
			this.fname = value;
			return this;
		}

		public Builder lName(String value) {
			this.lName = value;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}
}
