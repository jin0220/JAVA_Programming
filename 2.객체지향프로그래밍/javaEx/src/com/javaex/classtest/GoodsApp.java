package com.javaex.classtest;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods(); //��ü ����
//		camera.name = "nikon";
//		camera.price = 400000;
//		
//		System.out.println("��ǰ�̸�: " + camera.name);
//		System.out.println("��ǰ����: " + camera.price);
		
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.showInfo();
		
		Goods computer = new Goods("LG�׷�", 900000);
//		computer.name = "LG�׷�";
//		computer.price = 900000;
//		
//		System.out.println("��ǰ�̸�: " + computer.name);
//		System.out.println("��ǰ����: " + computer.price);
		
//		computer.setName("LG�׷�");
//		computer.setPrice(900000);
		computer.showInfo();
		
		Goods cup = new Goods();
//		cup.name = "�ӱ���";
//		cup.price = 2000;
//		
//		System.out.println("��ǰ�̸�: " + cup.name);
//		System.out.println("��ǰ����: " + cup.price);
		
		cup.setName("�ӱ���");
		cup.setPrice(2000);
		cup.showInfo();
	}

}
