package com.demo.bank;

import com.demo.bank.loan.Loan;
import com.demo.bank.model.Customer;
import com.demo.enums.LoanType;

public interface BankActivity {
	LoanType askLoanType();
	Loan askLoanDetails(LoanType type);
	Customer askCustomerDetails();
}
