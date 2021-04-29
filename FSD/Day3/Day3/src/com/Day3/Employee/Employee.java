package com.Day3.Employee;

public class Employee {
	private String name, add;
	private int yoj;
	private int salary;
	Employee(){
		
	}
	Employee(String name, int salary, int yoj, String add ){
		this.name = name;
		this.yoj = yoj;
		this.salary = salary;
		this.add = add; 
	}
	static void showFields() {
		System.out.println(String.format("%-15s %-17s %-26s %-18s","Name","Salary","Year of Joining","Address"));
		System.out.println("----------------------------------------------------------------------------");
	}
	
	void showDetails() {
		System.out.println(String.format("%-15s %-17d %-26d %-18s",name,salary,yoj,add));
	}
}
