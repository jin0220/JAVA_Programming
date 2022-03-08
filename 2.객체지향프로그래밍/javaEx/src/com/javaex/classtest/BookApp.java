package com.javaex.classtest;

public class BookApp {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("이문열");
		book1.setAuthor("삼국지");
		book1.showInfo();
		
		Book book2 = new Book();
		book2.setTitle("박경리");
		book2.setAuthor("토지");
		book2.showInfo();
	}

}
