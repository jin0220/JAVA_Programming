package com.javaex.classtest;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		// TODO Auto-generated constructor stub
	}

	public ColorPoint(String color) {
		super();
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void showInfo() {
		System.out.println("��[x = " + this.getX() + ", y=" 
					+ this.getY() + ", color= " + color + "]�� �׷Ƚ��ϴ�.");
	}
}
