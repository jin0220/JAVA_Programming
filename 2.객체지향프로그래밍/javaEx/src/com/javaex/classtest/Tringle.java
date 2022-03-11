package com.javaex.classtest;

public class Tringle extends Shape{
	private double width;
	private double height;

	public Tringle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (this.width * this.height) / 2.0;
	}

}
