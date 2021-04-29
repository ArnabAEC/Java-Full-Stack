package com.Day3.Emp;



public class testEmployee {
	public static void main(String[] args) {
		
		
		
		employee E1 = new employee("Ramesh", 15000, 8);
		
		System.out.print("Before adding Bonus  :\t");
		E1.showDetails();
		E1.addBonus();
		E1.addOvertime();
		System.out.print("After adding Bonus   :\t");;
		E1.showDetails();
		
		employee E2 = new employee("Carl", 8000, 16);
		System.out.print("Before adding Bonus  :\t");
		E2.showDetails();
		E2.addBonus();
		E2.addOvertime();
		System.out.print("After adding Bonus   :\t");
		E2.showDetails();
		
		employee E3 = new employee("John", 34000, 12);
		
		System.out.print("Before adding Bonus  :\t");
		E3.showDetails();
		E3.addBonus();
		E3.addOvertime();
		System.out.print("After adding Bonus   :\t");
		E3.showDetails();
		
		employee E4 = new employee("Mark", 19000, 8);
		
		System.out.print("Before adding Bonus  :\t");
		E4.showDetails();
		E4.addBonus();
		E4.addOvertime();
		System.out.print("After adding Bonus   :\t");
		E4.showDetails();
	}
}