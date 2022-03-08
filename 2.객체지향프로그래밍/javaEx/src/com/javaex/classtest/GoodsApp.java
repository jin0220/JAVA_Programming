package com.javaex.classtest;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods(); //객체 생성
//		camera.name = "nikon";
//		camera.price = 400000;
//		
//		System.out.println("상품이름: " + camera.name);
//		System.out.println("상품가격: " + camera.price);
		
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.showInfo();
		
		Goods computer = new Goods("LG그램", 900000);
//		computer.name = "LG그램";
//		computer.price = 900000;
//		
//		System.out.println("상품이름: " + computer.name);
//		System.out.println("상품가격: " + computer.price);
		
//		computer.setName("LG그램");
//		computer.setPrice(900000);
		computer.showInfo();
		
		Goods cup = new Goods();
//		cup.name = "머그컵";
//		cup.price = 2000;
//		
//		System.out.println("상품이름: " + cup.name);
//		System.out.println("상품가격: " + cup.price);
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
	}

}
