package com.javaex.classtest;

public class Student extends Person {
	private String scholName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String scholName) {
		super();
		this.scholName = scholName;
		System.out.println("������ ȣ�� -> Student(String scholName)");
	}
	
	public Student (String name, int age) {
		super(name, age);
	}

	public Student (String name, int age, String scholName) {
		super(name, age);
		this.scholName = scholName;
		System.out.println("������ ȣ�� -> Student(String name, int age, String scholName)");
	}

	public String getScholName() {
		return scholName;
	}

	public void setScholName(String scholName) {
		this.scholName = scholName;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("�б�: "+ scholName );
	}
	
}
