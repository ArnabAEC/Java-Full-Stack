package com.demo.bank;

import java.util.Scanner;

import com.demo.bank.loan.CarLoan;
import com.demo.bank.loan.EducationLoan;
import com.demo.bank.loan.HomeLoan;
import com.demo.bank.loan.Loan;
import com.demo.bank.model.Address;
import com.demo.bank.model.Customer;
import com.demo.enums.Education;
import com.demo.enums.Gender;
import com.demo.enums.LoanType;
import com.demo.util.MyScanner;

public abstract class Bank implements BankActivity, BankCutomer {

	@Override
	public LoanType askLoanType() {
		System.out.println("asking for loan type");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 for HomeLoan");
		System.out.println("Press 2 for EducationLoan");
		System.out.println("Press 3 for CarLoan");
		int selectedValue = MyScanner.getScanner().nextInt();
		if(selectedValue == 1) {
			return LoanType.HomeLoan;
		} else if(selectedValue == 2) {
			return LoanType.EducationLoan;
		} else if(selectedValue == 3) {
			return LoanType.CarLoan;
		} else {
			System.out.println("You have not selected a valid loan type");
			System.exit(0);
			return null;
		}
	}

	@Override
	public Customer askCustomerDetails() {
		System.out.println("asking for customer detials");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your personal details:");
		System.out.println("Name: ");
		String name = scanner.next();

		System.out.println("Gender: ");
		System.out.println("Press 1 for male");
		System.out.println("Press 2 for female");
		int genderOption = scanner.nextInt();
		Gender gender = null;
		if(genderOption == 1) {
			gender = Gender.MALE;
		} else {
			gender = Gender.FEMALE;
		}
		
		System.out.println("Age: ");
		int age = scanner.nextInt();
		
		System.out.println("Address (city): ");
		String city = scanner.next();

		System.out.println("Address (state): ");
		String state = scanner.next();

		System.out.println("Address (country): ");
		String country = scanner.next();

		System.out.println("Address (pin): ");
		String pin = scanner.next();

		
		System.out.println("Enter Education details:");
		System.out.println("Press 1 for Graduate");
		System.out.println("Press 2 for UnderGraduate");
		System.out.println("Press 3 for PostGraduate");
		int educationOption = scanner.nextInt();
		Education educationType = null;
		if(educationOption == 1) {
			educationType = Education.Graduate;
		} else if(educationOption == 2) {
			educationType = Education.UnderGraduate;
		} else {  
			educationType = Education.PostGraduate;
		}
		
		return new Customer(name, age, gender, new Address(city, state, country, pin), educationType);
	}

	@Override
	public void applyLoan() {
		/*
		 * System.out.println("applying for loan"); LoanType loanType = askLoanType();
		 * System.out.println("Selected loan is "+loanType); Loan loan =
		 * askLoanDetails(loanType); System.out.println("Loan is ready");
		 * System.out.println(loan); Customer customer = askCustomerDetails();
		 * System.out.println("Customer is ready"); System.out.println(customer);
		 */
		
		Loan loan = askLoanDetails(askLoanType());
		Customer customer = askCustomerDetails();
		
		boolean isValid = loan.verify(customer);
		
		if(isValid) {
			// show chart
			loan.calculateEmi();
		} else {
			System.out.println("bye bye");
		}
	}
	
	
	@Override
	public Loan askLoanDetails(LoanType loanType) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Loan amount:");
		double amount = scanner.nextDouble();
		System.out.println("Enter duration for loan(years):");
		int years = scanner.nextInt();
		
		if(loanType == LoanType.HomeLoan) {
			System.out.println("Creating home loan");
			return new HomeLoan(amount, loanType, years);
		} else if(loanType == LoanType.EducationLoan) {
			System.out.println("Creating education loan");
			return new EducationLoan(amount, loanType, years);
		} else if(loanType == LoanType.CarLoan) {
			System.out.println("Creating car loan");
			return new CarLoan(amount, loanType, years);
		} else {
			System.out.println("Invalid loan type");
			System.exit(0);
			return null;
		}
	}

	
	
	
}
