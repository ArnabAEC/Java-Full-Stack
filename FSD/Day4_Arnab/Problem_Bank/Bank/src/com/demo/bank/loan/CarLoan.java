package com.demo.bank.loan;

import com.demo.enums.LoanType;

public class CarLoan extends Loan {
	private static final int ROI = 8;// from database
	public CarLoan(double amount, LoanType loanType, int years) {
		super(amount, loanType, ROI, years);
	}
	
}
