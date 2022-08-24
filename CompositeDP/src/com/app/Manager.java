package com.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {

	private String name;
	private double salary;

	public Manager(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	List<Employee> employees = new ArrayList<>();

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public Employee getChild(int i) {
		return employees.get(i);
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
	public double getTotalSalary() {
		double totalSalary = this.getSalary();
		Iterator<Employee> empitr = employees.iterator();
		while (empitr.hasNext()) {
			Employee employee = empitr.next();
			totalSalary += employee.getTotalSalary();
		}
		return totalSalary;
	}

	@Override
	public void print() {
		System.out.println("-------");
		System.out.println("Name " + getName());
		System.out.println("Name " + getSalary());
		System.out.println("-------");

		Iterator<Employee> empitr = employees.iterator();
		while (empitr.hasNext()) {
			Employee employee = empitr.next();
			employee.print();
		}

	}

}
