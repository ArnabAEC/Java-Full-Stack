package com.demo.bank.loan;

import com.demo.enums.LoanType;

public class EducationLoan extends Loan {
	private static final int ROI = 3;// from database
	public EducationLoan(double amount, LoanType loanType, int years) {
		super(amount, loanType, ROI, years);
	}
}
