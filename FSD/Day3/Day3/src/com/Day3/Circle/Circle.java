package com.Day3.Circle;

public class Circle {
	
	private double radius;
	
	Circle(){
		this(1);
	}
	Circle(double radius){
		this.radius = radius;
	}
	
	double getRadius() {
		
		return (this.radius);
	}
	
	double getArea() {
		return (Math.PI*this.radius*this.radius);
	}
	
	double getCircumference() {
		return (2*Math.PI*this.radius);
	}
	
	
}
