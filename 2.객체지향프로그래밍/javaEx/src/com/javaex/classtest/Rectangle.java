package com.javaex.classtest;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}
	
	public boolean equals(Object obj) {
		Rectangle r = ((Rectangle)obj); //다운캐스팅

		if(this.width * this.height == r.width * r.height) {
			return true;
		}
		else {
			return false;
		}
	}

}
