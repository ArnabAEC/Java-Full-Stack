package com.Day3.Class;

public class student {

	int rollNo;
	String name, ph, add;
	
	student(){
		
	}
	
	student(String name, String ph, String add, int rollNo){
		this.name = name;
		this.ph = ph;
		this.add = add;
		this.rollNo = rollNo;
	}
	
	public void show() {
		System.out.println("-------Student Details-------");
		System.out.println("Roll No :\t"+rollNo);
		System.out.println("Name    :\t"+name);
		System.out.println("Phone   :\t"+ ph);
		System.out.println("Address :\t" + add);
		System.out.println();
	}
}
