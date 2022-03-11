package com.javaex.problem;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	// getter setter
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// ������
	public Book(int bookNo, String title, String author) {
		this(bookNo, title, author, 1);
	}
	
	public Book(int bookNo, String title, String author, int stateCode) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = stateCode;
	}

	//�޼���
    public void rent() {
    	this.stateCode = 0;
    	System.out.println(title + "��(��) �뿩 �ƽ��ϴ�.");
    }
    
    public void print() {
    	if(stateCode == 1)
    		System.out.println("å����: " + title + " ����: " + author + " �뿩����: �������");
    	else
    		System.out.println("å����: " + title + " ����: " + author + " �뿩����: �뿩��");
    }
}
