package com.Day3.Emp;


public class employee {
	private String name;
	private int number_of_hours_per_day;
	private int salary;
	employee(){
		
	}
	employee(String name, int salary, int number_of_hours_per_day ){
		this.name = name;
		this.number_of_hours_per_day = number_of_hours_per_day;
		this.salary = salary;
	}
	int addBonus() {
		if(salary<10000) {
			salary += 500;
			return 500;
		}
		else
			return 0;
			
	}
	
	int addOvertime() {
		if(number_of_hours_per_day>6) {
			salary += (number_of_hours_per_day-6)*50*21;	//Assuming 21 working days
			return (number_of_hours_per_day-6)*50*21;
		}
		else
			return 0;
	}
	
	
	void showDetails() {
		System.out.println(String.format("%-17s %-17d %-17d",name,salary,number_of_hours_per_day));
	}
}
