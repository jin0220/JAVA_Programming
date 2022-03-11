package com.javaex.classtest;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.setWidth(3.0);
		r.setHeight(4.0);
		System.out.println("사각형의 넓이는: " + r.area());
		
		Tringle t = new Tringle(3.0, 4.0);
		System.out.println("삼각형의 넓이는: " + t.area());
		
		Circle c = new Circle(5.0);
		System.out.println("원의 넓이는: " + c.area());
		
		Shape cc = new Circle(3.0);
		
		System.out.println(cc instanceof Circle);
		System.out.println(cc instanceof Drawable);
		System.out.println(cc instanceof Rectangle);
		System.out.println(cc instanceof Shape);
		
	}

}
