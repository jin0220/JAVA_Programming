package com.javaex.classtest;

public class Goods {
	private String name;
	private int price;
	
	public Goods() {
		this("이름 없음", 0);
	}
	
	public Goods(String name, int price) {
//		this.name = name;
//		this.price = price;
		this(price, name);
	}
	
	public Goods(int price, String name) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품이름: " + getName());
		System.out.println("상품가격: " + getPrice());
		System.out.println();
	}
}
