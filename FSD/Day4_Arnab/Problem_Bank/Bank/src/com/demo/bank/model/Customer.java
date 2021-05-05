package com.demo.bank.model;

import com.demo.enums.Education;
import com.demo.enums.Gender;

public class Customer {

//	Name, Gender(Male, Female), age, Address (city, state, country, pin)  
	private String name;
	private int age;
	private Gender gender;
	private Address address;
	
	private Education education;
	
	
	
	public Customer(String name, int age, Gender gender, Address address, Education education) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.education = education;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", education=" + education + "]";
	}

}
