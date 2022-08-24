package com.clients;

import com.domain.Employee;
import com.domain.EmployeeDao;
import com.reporting.EmployeereportFormatter;
import com.reporting.FormateType;

//single-responsibility principle
public class EmployeeMainApp {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "admin", "finance", true);
		EmployeeMainApp.hireEmployee(emp1);
		printEmployeeReport(emp1, FormateType.PDF);

	}

	public static void hireEmployee(Employee employee) {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.saveEmployee(employee);
	}

	public static void removeEmployee(Employee employee) {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.removeEmployee(employee);
	}

	public static void printEmployeeReport(Employee employee, FormateType formatType) {
		EmployeereportFormatter formatter = new EmployeereportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}
}
