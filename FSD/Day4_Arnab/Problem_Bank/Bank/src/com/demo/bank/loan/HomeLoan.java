package com.demo.bank.loan;

import com.demo.enums.LoanType;

public class HomeLoan extends Loan {
	private static final int ROI = 5;// from database
	public HomeLoan(double amount, LoanType loanType, int years) {
		super(amount, loanType, ROI, years);
	}
}
