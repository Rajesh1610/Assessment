package com.demo.assessment;

import java.util.*;

public class CollectionTest {

	List<Employee> employees = new ArrayList<Employee>();

	public void addDetails(Employee e) {
		employees.add(e);
	}

	public void showAllEmp() {
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));

		}

		System.out.println("________________________________________________");
	}

	public void findSalaryByEmployee(String empName) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getEmpName().equals(empName)) {
				System.out.println("The salary for.." + employees.get(i).getEmpName() + "  is");
				System.out.println(employees.get(i).getEmpSalary());
			}
		}
	}

	public void deleteEmployeeByName(String empName) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getEmpName() == empName) {

				System.out.println("The employee" + "  " + employees.get(i).getEmpName() + "  " + "has been deleted");
				employees.remove(i);
				System.out.println("_________The updated List..is below______");
				showAllEmp();
			}

		}

	}

	public void updateEmp(Employee set) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getEmpName() == set.getEmpName()) {

				System.out.println("the updated age for Employee    " + employees.get(i).getEmpName() + "   is ");
				employees.set(i, set);
				showAllEmp();

			}
		}
	}

	// ____________________________________ForEach______________________________________________

	public void showAllEmpByForEach() {
		for (Employee e1 : employees) {
			System.out.println(e1);

		}
		System.out.println("___________  ____________  ____________");
	}

	public void findSalaryByEmployeeByForEach(String empName) {
		for (Employee e : employees) {
			if (e.getEmpName().equals(empName)) {
				System.out.println("The salary for.." + empName + "  is.....");
				System.out.println(e.getEmpName() + "   :" + e.getEmpSalary());
				System.out.println("____________________________________________________");

			}
		}
	}

	public void delete(String empName) {
		for (Employee et : employees) {
			if (et.getEmpName().equals(empName)) {
				employees.remove(et);
				showAllEmpByForEach();
			}
		}
	}

	public void deleteEmployeeByNameByForEach(String empName) {
		employees.forEach(ey -> {
			if (ey.getEmpName().equals(empName)) {
				System.out.println("The Employee ..." + empName + "  is deleted");
				employees.remove(ey);
				System.out.println("_________The updated List..is below______");
				showAllEmpByForEach();

			}
		});
	}

	public void deleteEmployeeByNameByForEach1(String empName) {

		Iterator<Employee> ll = employees.iterator();
		while (ll.hasNext()) {
			Employee ey = ll.next();
			if (ey.getEmpName().equals(empName)) {
				System.out.println("The Employee------:" + empName + "  " + " has been  deleted");
				ll.remove();
				System.out.println("_________ And The updated List..is below______");
				showAllEmpByForEach();
			}
		}
	}

	public void updateEmpByForEach(Employee set1) {

		System.out.println("Before Updation_________");
		showAllEmpByForEach();
		for (Employee eu : employees) {
			if (eu.getEmpName().equals(set1.getEmpName())) {

				System.out.println("the updated age for Employee     is ");
				employees.set(2, set1);
				showAllEmpByForEach();
			}
		}
	}
}

//	public void UpdateIterator(String empName) {
//		
//		
//			Iterator<Employee> lk=employees.iterator();
//				while(lk.hasNext()) {
//					Employee  ul=lk.next();
//					if(ul.get)

// }

// }

//		public void updateEmpByForEachAge(int empAge) {
//			for(Employee eu:employees) {
//				if (eu.getEmpName().equals(empName)) {
//
//					System.out.println("the updated age for Employee    " + empName + "   is ");
//					employees.set(0, eu);
//					showAllEmpByForEach();
//				}
//			}

//print in correct format
//try retreving the salary of employee rajesh
//try deleteing one of the employee name is ebhi
//update age of employee srii
//try adding another name rajesh a employee//

//______________________________________________________________________________________________________________________________
//for (Employee e : employees)
//
//	if (employees.get(i).getEmpName() == empName) {
//
//		System.out.println("The employee" + "  " + employees.get(i).getEmpName() + "  " + "has been deleted");
//		employees.remove(i);
//	}
//}
//public void findSalaryByEmployeeByForEach1(String empName) {
//for(Employee ey : employees) {
//	
//}
//forEach(employees ->{
//	if(employees.equals(empName)) {
//		System.out.println("The salary for.." + employees.getEmpName() + "  is");
//		System.out.println(employees.getEmpSalary());
//	}
//});
//System.out.println();

//if (employees.get(i).getEmpName() == empName) {
//	System.out.println("The salary for.." + employees.get(i).getEmpName() + "  is");
//	System.out.println(employees.get(i).getEmpSalary());
//	i++;
//}
//}

//public void delete1(int empAge) {
//	for(Employee et:employees) {
//		if(et.getEmpAge()==empAge) {
//			employees.remove(et);
//			showAllEmpByForEach();
//		}
//	}
//}_________________________________________________________

//_______________________________________________________________________________________________
