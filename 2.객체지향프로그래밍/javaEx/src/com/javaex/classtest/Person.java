package com.javaex.classtest;

public class Person {
	private String name;
	private int age;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("������ ȣ�� -> Person(String name, int age)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println("�̸�: " + name + "\n����: " + age);
	}
}
