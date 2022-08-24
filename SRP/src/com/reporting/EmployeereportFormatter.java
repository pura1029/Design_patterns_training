package com.reporting;

import com.domain.Employee;

public class EmployeereportFormatter extends ReportFormatter {

	public EmployeereportFormatter(Employee employee, FormateType formatType) {
		super(employee, formatType);

	}

	public String getFormattedEmployee() {
		return this.getFormattedOutput();
	}

}
