package com.javaex.problem02;

public class Depart extends Employee {

	//�ڵ��ۼ�
	private String depart;
	
	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	
	//�������̵�
	public void getInformation() {
		System.out.println("�̸�:" + super.getName() + " ����:" + super.getSalary() + " �μ�: " + depart);
	}

}
