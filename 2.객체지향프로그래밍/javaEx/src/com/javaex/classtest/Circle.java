package com.javaex.classtest;

public class Circle extends Shape implements Drawable{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원 그리기");
	}

	private double r;

	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.r * this.r * 3.14;
	}

}
