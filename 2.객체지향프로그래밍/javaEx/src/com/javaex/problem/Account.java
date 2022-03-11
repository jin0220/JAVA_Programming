package com.javaex.problem;

public class Account {

    private String accountNo;
    private int balance;
    
    //������ �ۼ�
    public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
		this.balance = 0;
		System.out.println(accountNo + " ���°� �����Ǿ����ϴ�.");
	}
    
     //�ʿ��� �޼ҵ� �ۼ�
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if(balance - money < 0)
			System.out.print("��� �ݾ��� �����մϴ�.");
		else
			balance -= money;
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
	
}
