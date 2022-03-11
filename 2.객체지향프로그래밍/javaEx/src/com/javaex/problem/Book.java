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

	// 생성자
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

	//메서드
    public void rent() {
    	this.stateCode = 0;
    	System.out.println(title + "이(가) 대여 됐습니다.");
    }
    
    public void print() {
    	if(stateCode == 1)
    		System.out.println("책제목: " + title + " 저자: " + author + " 대여유무: 재고있음");
    	else
    		System.out.println("책제목: " + title + " 저자: " + author + " 대여유무: 대여중");
    }
}
