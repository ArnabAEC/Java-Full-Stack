package com.Day3.Employee;

public class testEmployee {
	public static void main(String[] args) {
		
		Employee.showFields();
		
		Employee E1 = new Employee("Ramesh", 15000, 2015, "Delhi" );
		E1.showDetails();
		Employee E2 = new Employee("Carl", 25000, 2019, "Punjab");
		E2.showDetails();
		Employee E3 = new Employee("John", 34000, 2017, "Pune");
		E3.showDetails();
		Employee E4 = new Employee("Mark", 19000, 2020, "Tokyo");
		E4.showDetails();
	}
}
