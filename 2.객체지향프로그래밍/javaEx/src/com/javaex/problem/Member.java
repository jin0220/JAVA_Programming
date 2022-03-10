package com.javaex.problem;

public class Member {
	private String id;
	private String name;
	private int point;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String name, int point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.println("ȸ�� ���̵�: " + this.getId());
		System.out.println("ȸ�� �̸�: " + this.getName());
		System.out.println("ȸ�� ����Ʈ: " + this.getPoint());
	}
	
}
