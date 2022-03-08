package com.javaex.classtest;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(5,5);
		p1.draw();
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		p2.draw();
		
		p1.draw(true);
		p2.draw(true);
		
		p1.draw();
		p2.draw();
	}

}
