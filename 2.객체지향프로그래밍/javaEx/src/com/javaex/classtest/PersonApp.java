package com.javaex.classtest;

public class PersonApp {
	
	public static void main(String[] args) {
		Person p = new Person("���켺", 45);
		p.showInfo();
		
		Student s1 = new Student("�������б�");
		s1.showInfo();
		
		Student s2 = new Student("������", 45, "�ѱ�����б�");
		s2.showInfo();
	}
}
