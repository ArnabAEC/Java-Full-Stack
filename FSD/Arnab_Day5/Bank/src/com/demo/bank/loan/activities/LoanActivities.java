package com.demo.bank.loan.activities;

import com.demo.bank.model.Customer;

public interface LoanActivities {
	boolean verify(Customer customer);
	void calculateEmi();
}
