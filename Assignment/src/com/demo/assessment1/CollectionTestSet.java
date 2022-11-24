package com.demo.assessment1;

import java.util.*;

public class CollectionTestSet {

	Set<Employee> st = new HashSet<>();

	public void addDetails(Employee s) {
		st.add(s);
	}

	public void fetchAllEmployees() {
		for (Employee e1 : st) {
			System.out.println(e1);

		}
	}

	public void findSalaryByEmployee(String empName) {
		for (Employee ee : st) {
			if (ee.getEmpName().equals(empName)) {
				System.out.println("The salary for.." + empName + "  is.....");
				System.out.println(ee.getEmpName() + "   :" + ee.getEmpSalary());

			}
		}
	}

	public void deleteEmployeeByName(String empName) {
	
		Iterator<Employee> itr = st.iterator();
		while (itr.hasNext()) {
			Employee es = itr.next();

			if (es.getEmpName().equals(empName)) {
				itr.remove();
				
				System.out.println("the updated list set is below");
				fetchAllEmployees();

			}
		}

	}
}

//	public void updateEmpByForEach(Employee replace) {
//
//		System.out.println("Before Updation_________");
//		fetchAllEmployees();
//		for (Employee eu : st) {
//			if (eu.getEmpName().equals(replace.getEmpName())) {
//
//				System.out.println("the updated age for Employee     is ");
//				st.
//				fetchAllEmployees();
//			}
//		}

	
