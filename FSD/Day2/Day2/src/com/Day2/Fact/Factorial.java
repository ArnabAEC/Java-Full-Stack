package com.Day2.Fact;
//Java Program to find Factorial of a number using Recursion

public class Factorial {
	public static void main(String[] args) {
		
		int n = 6;
		
		System.out.println("Number: "+n+" , Factorial: "+factorial(n));	
	}

	static int factorial(int n) {
		
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
}
