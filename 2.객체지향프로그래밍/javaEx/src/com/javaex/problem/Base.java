package com.javaex.problem;

public class Base {
	public void service(String s) {
//		if(s.equals("��"))
//			day();
//		else if(s.equals("��"))
//			night();
//		else
//			afternoon();
		
		//nullüũ�ϴµ� ȿ����
		if("��".equals(s))
			day();
		else if("��".equals(s))
			night();
		else if("����".equals(s))
			afternoon();
	}
	
	public void day() {
		System.out.println("������ ������ ������");
	}
	
	public void night() {
		System.out.println("night");
	}
	
	public void afternoon() {
		System.out.println("���ĵ� ���� ���������� ���ؾ� �մϴ�.");
	}
}
