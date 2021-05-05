package com.demo.bank.loan;

import com.demo.enums.LoanType;

public class GoldLoan extends Loan {
	private static final int ROI = 12;// from database
	public GoldLoan(double amount, LoanType loanType, int years) {
		super(amount, loanType, ROI, years);
	}
}
