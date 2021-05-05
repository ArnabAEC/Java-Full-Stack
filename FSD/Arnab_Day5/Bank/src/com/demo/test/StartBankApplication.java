package com.demo.test;

import com.demo.bank.BankCutomer;
import com.demo.bank.SbiBank;

public class StartBankApplication {

	public static void main(String[] args) {
		BankCutomer sbi = new SbiBank();
		sbi.applyLoan();
	}
}
