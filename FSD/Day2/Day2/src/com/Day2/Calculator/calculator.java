package com.Day2.Calculator;

public class calculator {
public static void main(String[] args) {
	int a = 8, b = 5, c = 7, d = 33;
	System.out.println(a+" + "+b+" = " +add(a,b));
	System.out.println(a+" + "+b+ " + "+ c+ " = "+add(a,b,c));
	System.out.println(a+" + "+b+" + "+c+" + "+d+" = "+add(a,b,c,d));
	System.out.println(a+" - "+b+ " = "+sub(a,b));
	System.out.println(a+" x "+ b+ " = "+multiply(a,b));
	System.out.println(a+ " / "+b+" = "+div(a,b));
	System.out.println("Square of "+a+" = "+square(a));
	System.out.println("Root of "+a+" = "+root(a));
	System.out.println("Cube of "+a+" = "+cube(a));
	System.out.println("Undercube of "+a+" = "+undercube(a));
}
static int add(int a, int b) {
	return a+b;
}
static int add(int a, int b, int c) {
	return a+b+c;
}
static int add(int a, int b, int c, int d) {
	return a+b+c+d;
}
static int sub(int a, int b) {
	return a-b;
}
static int multiply(int a, int b) {
	return a*b;
}
static int div(int a, int b) {
	return a/b;
}
static int square(int a) {
	return a*a;
}
static int cube(int a) {
	return a*a*a;
}
static double root(int a) {
	return Math.sqrt(a);
}
static double undercube(int a) {
	return Math.cbrt(a);
}
}
