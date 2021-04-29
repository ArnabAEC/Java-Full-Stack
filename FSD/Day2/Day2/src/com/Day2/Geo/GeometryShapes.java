package com.Day2.Geo;
/*JAVA PROGRAMS ON GEOMETRICAL CALCULATIONS
Java Program to Calculate Area of Rectangle
Java Program to Calculate Area of Square
Java Program to Calculate the area of Triangle
Java Program to Calculate Area and Circumference of Circle*/
public class GeometryShapes {

	public static void main(String[] args) {
		
		int s = 4;
		System.out.println("Side: "+ s+ " , Area: "+ squareArea(s));
		int l = 5, b = 7;
		System.out.println("Length: "+ l+ " , Breadth: "+ b+ " , Area: "+ rectArea(l,b));
		int h = 5;
		b = 7;
		System.out.println("Base: "+ b+ " , Height: "+ h+ " , Area: "+ triangleArea(b,h));
		int r = 6;
		System.out.println("Radius: "+ r +" , Circumference: "+circleCircumference(r)+" , Area: "+circleArea(r) );
	}
	
	static int squareArea(int s) {
		return s*s;
	}
	
	static int rectArea(int l, int b) {
		return l*b;
	}
	
	static float triangleArea(float b, float h) {
		return b*h/2;
	}
	
	static double circleArea(float r) {
		return Math.PI*r*r;
	}
	static double circleCircumference(float r) {
		return Math.PI*2*r;
	}
}
