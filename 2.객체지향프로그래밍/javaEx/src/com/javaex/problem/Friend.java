package com.javaex.problem;
public class Friend {
    private String name;
    private String hp;
    private String school;
    
    public Friend() {
		// TODO Auto-generated constructor stub
	}
    
    public Friend(String name, String hp, String school) {
		super();
		this.name = name;
		this.hp = hp;
		this.school = school;
	}

	//�ʿ��� �޼ҵ� �ۼ�
    public void showInfo(){
        System.out.println("�̸�:"+name+"  �ڵ���:"+hp+"  �б�:"+school);
    }
}
