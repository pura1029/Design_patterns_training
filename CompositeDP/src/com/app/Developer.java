package com.app;

public class Developer implements Employee {

	private String name;
	private double salary;

	public Developer(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {

	}

	@Override
	public void remove(Employee employee) {

	}

	@Override
	public Employee getChild(int i) {
		return null;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("-------");
		System.out.println("Name " + getName());
		System.out.println("Name " + getSalary());
		System.out.println("-------");
	}

	@Override
	public double getTotalSalary() {
		return this.getSalary();
	}

}
