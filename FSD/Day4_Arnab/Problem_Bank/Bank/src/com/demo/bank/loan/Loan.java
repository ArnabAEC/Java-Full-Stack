package com.demo.bank.loan;

import java.util.Scanner;

import com.demo.bank.loan.activities.LoanActivities;
import com.demo.bank.model.Customer;
import com.demo.enums.Education;
import com.demo.enums.Gender;
import com.demo.enums.LoanType;

public abstract class Loan implements LoanActivities {
	
	private double amount;
	private LoanType loanType;
	private double roi;
	private int years;
	
	protected Loan(double amount, LoanType loanType, double roi, int years) {
		this.amount = amount;
		this.loanType = loanType;
		this.roi = roi;
		this.years = years;
	}
	
	
	@Override
	public String toString() {
		return "Loan [amount=" + amount + ", loanType=" + loanType + ", roi=" + roi + ", years=" + years + "]";
	}


	public boolean verify(Customer customer) {
		System.out.println("verifying user");
		
		if(customer.getAddress().getCountry().equalsIgnoreCase("India")) {
			// User is Male, Graduate and age is more than 60 years 
			if(
					customer.getGender()==Gender.MALE &&
					customer.getEducation() == Education.Graduate &&
					customer.getAge() > 60
			) {
				System.out.println("80% of loan amount is approved: (Y/N)");
				amount = amount*0.8;
				Scanner scanner = new Scanner(System.in);
				String choice = scanner.next();
				return choice.equalsIgnoreCase("Y")?true:false;
			} else {
				if((customer.getGender()==Gender.FEMALE) && (customer.getEducation()==Education.Graduate) &&(customer.getAge()>55)) {
					System.out.println("80% of loan amount is approved: (Y/N)");
					amount = amount*0.8;
					Scanner scanner = new Scanner(System.in);
					String choice = scanner.next();
					return choice.equalsIgnoreCase("Y")?true:false;
				}
				if((customer.getGender()==Gender.MALE) && (customer.getEducation()==Education.UnderGraduate) &&(customer.getAge()>35)) {
					System.out.println("60% of loan amount is approved: (Y/N)");
					amount = amount*0.6;
					Scanner scanner = new Scanner(System.in);
					String choice = scanner.next();
					return choice.equalsIgnoreCase("Y")?true:false;
				}
				if((customer.getGender()==Gender.FEMALE) && (customer.getEducation()==Education.UnderGraduate) &&(customer.getAge()>30)) {
					System.out.println("60% of loan amount is approved: (Y/N)");
					amount = amount*0.6;
					Scanner scanner = new Scanner(System.in);
					String choice = scanner.next();
					return choice.equalsIgnoreCase("Y")?true:false;
				}
				if(customer.getEducation()==Education.PostGraduate) {
					System.out.println("90% of loan amount is approved: (Y/N)");
					amount = amount*0.9;
					Scanner scanner = new Scanner(System.in);
					String choice = scanner.next();
					return choice.equalsIgnoreCase("Y")?true:false;
				}
				
				return false;
			}
		} else {	
			System.out.println("We do not serve in your country");
			return false;
		}
	}
	public void calculateEmi() {

		  
		   double principal = amount, monthlyRate = roi/12/100, months  = years*12;

		   double EMI = principal*monthlyRate*(Math.pow((1+monthlyRate),months)) / (Math.pow((1+monthlyRate),months)-1);
		  
		   System.out.println(loanType+" Details");
		   System.out.println("---------------------------------------------------");
		   System.out.println();
		   System.out.println("Sanctioned loan amount: "+Math.round(principal));
		   System.out.println("Loan Duration: "+years+" years");
		   System.out.println("Rate of interest: "+roi+" %");
		   System.out.println("EMI to be paid every month: "+Math.round(EMI));
		   System.out.println();
		   System.out.println("---------------------------------------------------");
		   System.out.println();
		   System.out.println("********************************EMI Chart********************************");
		   System.out.println();
		   generateChart(EMI, principal, months, monthlyRate);
		   
		   // 
		   
	}
	
	protected void generateChart(double EMI, double amt, double months, double monthlyRate) {
		
		System.out.println(String.format("%-18s %-29s %-17s %-34s %-35s %-30s %-15s","|       Year","|       Opening Balance","|       EMI","|       Interest paid yearly","|       Principal paid yearly","|        Closing Balance","|"));
		System.out.println("|------------------|-----------------------------|-----------------|----------------------------------|-----------------------------------|------------------------------|");
		   for(int i = 1; i<= months/12 ; i++)
		   {
		   	double pinitial = amt;
		   	double py = 0;
		   	double inty = 0;
		    for(int j = 1; j <=12 ; j++){
		    	inty += amt*monthlyRate;
		    	py += EMI - amt*monthlyRate;
		    	amt = amt -( EMI - amt*monthlyRate);
		    }
		   System.out.println(String.format("%-8s %-9d %-10s %-18d %-5s %-11d %-13s %-20d %-13s %-21d %-12s %-17d %-15s","|",i,"|",Math.round(pinitial),"|",Math.round(EMI*12),"|",Math.round(inty),"|",Math.round(py),"|",Math.round(amt),"|"));

		   }	
		
	}
	
}
