package com.demo.bank.model;

public class Address {
	private String city;
	private String state;
	private String country;
	private String pin;
	
	
	
	
	public Address(String city, String state, String country, String pin) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
	}
	
	
}
