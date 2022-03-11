package com.javaex.problem02;

public class Depart extends Employee {

	//코드작성
	private String depart;
	
	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	
	//오버라이딩
	public void getInformation() {
		System.out.println("이름:" + super.getName() + " 연봉:" + super.getSalary() + " 부서: " + depart);
	}

}
