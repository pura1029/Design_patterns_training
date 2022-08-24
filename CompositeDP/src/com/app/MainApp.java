package com.app;

public class MainApp {

	public static void main(String[] args) {
		Employee emp1 = new Developer("John", 10000);
		Employee emp2 = new Developer("David", 20000);

		Employee man = new Manager("Danial", 30000);
		man.add(emp1);
		man.add(emp2);
		Employee emp3 = new Developer("Michal", 20000);
		Manager gm = new Manager("Mark", 50000);
		gm.add(emp3);
		gm.add(man);

		gm.print();

		System.out.println("Total Salary : " + gm.getTotalSalary());
	}

}
