package com.Day3.Circle;

public class testCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(12.8);

		System.out.println();
		System.out.println("Radius        :\t"+String.format("%.2f",c1.getRadius()));
		System.out.println("Circumference :\t"+String.format("%.2f",c1.getCircumference()));
		System.out.println("Area          :\t"+String.format("%.2f",c1.getArea()));
		System.out.println();
		System.out.println("Radius        :\t"+String.format("%.2f",c2.getRadius()));
		System.out.println("Circumference :\t"+String.format("%.2f",c2.getCircumference()));
		System.out.println("Area          :\t"+String.format("%.2f",c2.getArea()));
	}
}
