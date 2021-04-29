package com.Day2;

public class Pattern {
	public static void main(String[] args) {
		
		int n = 5;
		
		P1(n);
		P2(n);
		P3(n);
		P4(n);
		P5(n);
		P6(n);
		P7(n);
		P8(n);
		P9(n);
		P10(n);
		P11(n);
	}
	
	static void P1(int n) {
		System.out.println("------------------------------");
		for(int i=0;i<n;i++) {
			for(int j=0; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
	static void P2(int n) {
		System.out.println("------------------------------");
		for(int i=0;i<n;i++) {
			for(int j=n; j>i; j--)
				System.out.print("* ");
			System.out.println();
		}
	}
	static void P3(int n) {
		System.out.println("------------------------------");	
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");
			System.out.println();
			}
		}
	
static void P4(int n) {
	
	System.out.println("------------------------------");		
	
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=i; j++)
				System.out.print(i+" ");
			System.out.println();
		}
	}
	
static void P5(int n) {
	System.out.println("------------------------------");	
	char ch = 'A';
		for(int i=0;i<n;i++) {
			for(int j=0; j<=i; j++)
				System.out.print((char)(ch+j)+" ");
			System.out.println();
		}
	}
static void P6(int n) {
	System.out.println("------------------------------");
	for(int i=1;i<=n;i++) {
		for(int j=n; j>i; j--)
			System.out.print("  ");
		for(int j=0 ; j<i; j++)
			System.out.print("* ");
		System.out.println();
	}
}
static void P7(int n) {
	System.out.println("------------------------------");
	for(int i=1;i<=n;i++) {
		for(int j=1; j<i; j++)
			System.out.print("  ");
		for(int j=n ; j>=i; j--)
			System.out.print("* ");
		System.out.println();
	}
}
static void P8(int n) {
	System.out.println("------------------------------");
	for(int i=1;i<=n;i++) {
		for(int j=n; j>i; j--)
			System.out.print("  ");
		for(int j=i ; j>0; j--)
			System.out.print(j+" ");
		System.out.println();
	}
}
static void P9(int n) {
	System.out.println("------------------------------");
	for(int i=1;i<=n;i++) {
		for(int j=n; j>=i; j--)
			System.out.print("* ");
		for(int j=1; j<(2*i-1); j++)
			System.out.print("  ");

		for(int j=n ; j>=i; j--)
			System.out.print("* ");
		System.out.println();
	}
}
static void P10(int n) {
	System.out.println("------------------------------");
	for(int i=n;i>=1;i--) {
		for(int j=n; j>=i; j--)
			System.out.print("* ");
		for(int j=1; j<(2*i-1); j++)
			System.out.print("  ");

		for(int j=n ; j>=i; j--)
			System.out.print("* ");
		System.out.println("");
	}
}
static void P11(int n) {
	System.out.println("------------------------------");
	for(int i=1;i<=n;i++) {
		for(int j=n; j>=i; j--)
			System.out.print("* ");
		for(int j=1; j<(2*i-1); j++)
			System.out.print("  ");

		for(int j=n ; j>=i; j--)
			System.out.print("* ");
		System.out.println();
	}
	for(int i=n;i>=1;i--) {
		for(int j=n; j>=i; j--)
			System.out.print("* ");
		for(int j=1; j<(2*i-1); j++)
			System.out.print("  ");

		for(int j=n ; j>=i; j--)
			System.out.print("* ");
		System.out.println("");
	}
}
}

