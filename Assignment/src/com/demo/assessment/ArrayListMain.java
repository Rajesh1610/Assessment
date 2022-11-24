package com.demo.assessment;

public class ArrayListMain {

	public static void main(String[] args) {

		Employee e1 = new Employee("Rajesh", 56000, 22);
		Employee e2 = new Employee("Shyam", 45000, 20);
		Employee e3 = new Employee("srii", 34000, 29);
		Employee e4 = new Employee("rajesh", 56000, 26);
		Employee e5 = new Employee("Mohan", 48000, 23);
		Employee e6 = new Employee("Kumar", 67000, 27);
		Employee e7 = new Employee("Daniel", 73000, 34);
		Employee e8 = new Employee("Lawsan", 23000, 28);
		Employee e9 = new Employee("Yajesh", 56000, 22);
		Employee e10 = new Employee("Rajesh", 56000, 22);

		CollectionTest ct = new CollectionTest();
		ct.addDetails(e1);
		ct.addDetails(e2);
		ct.addDetails(e3);
		ct.addDetails(e4);
		ct.addDetails(e5);
		ct.addDetails(e6);
		ct.addDetails(e7);
		ct.addDetails(e8);
		ct.addDetails(e9);
		ct.addDetails(e9);
		ct.addDetails(e10);

		// By for Loop...
//		ct.showAllEmp();
//
//		ct.findSalaryByEmployee("Shyam");
//
//		ct.deleteEmployeeByName("Daniel");
//
//		Employee set1 = new Employee("Lawsan", 34000, 21);
//
//		ct.updateEmp(set1);
////__________________________________________________________________________________________		

		// By ForEach Loop.....

		ct.showAllEmpByForEach();

		ct.findSalaryByEmployeeByForEach("Shyam");

		ct.deleteEmployeeByNameByForEach1("Kumar");

		Employee set2 = new Employee("srii", 64000, 21);

		ct.updateEmpByForEach(set2);

	}
}

//print in correct format
//try retreving the salary of employee rajesh
//try deleteing one of the employee name is ebhi
//update age of employee srii
//try adding another name rajesh a employee//

//__