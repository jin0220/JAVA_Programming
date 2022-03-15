package com.javaex.classtest;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.println("점[x = " + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	public void draw(boolean delete) {
		if(delete) {
			System.out.println("점[x = " + x + ", y=" + y + "]을 지웠습니다.");
			this.setX(0);
			this.setY(0);
		}
	}
	
	// equal메서드 재정의
	public boolean equals(Object obj) {
		Point p = ((Point)obj); //다운캐스팅
		if(this.hashCode() == p.hashCode()) {
			return true;
		}
		else if(this.x == p.x && this.y == p.y) {
			return true;
		}
		else {
			return false;
		}
	}
}
