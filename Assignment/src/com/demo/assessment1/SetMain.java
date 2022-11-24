package com.demo.assessment1;

public class SetMain {

	public static void main(String[] args) {

		Employee s = new Employee("Hari", 34000, 21);
		Employee s1 = new Employee("Tamil", 45000, 23);
		Employee s2 = new Employee("Anush", 56000, 20);
		Employee s3 = new Employee("Arjun", 78000, 24);
		Employee s4 = new Employee("Rohit", 32000, 18);
		Employee s5 = new Employee("Srii", 28000, 20);
		Employee s6 = new Employee("Ebhi", 44000, 28);
		Employee s7 = new Employee("Anush",39000,28);

		CollectionTestSet cst = new CollectionTestSet();

		cst.addDetails(s);
		cst.addDetails(s1);
		cst.addDetails(s2);
		cst.addDetails(s3);
		cst.addDetails(s4);
		cst.addDetails(s5);
		cst.addDetails(s6);
		cst.addDetails(s7);

		cst.fetchAllEmployees();

		cst.findSalaryByEmployee("Srii");

		cst.deleteEmployeeByName("Anush");

	}

}
