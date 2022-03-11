package com.javaex.problem;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
		this.balance = 0;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
	}
    
     //필요한 메소드 작성
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if(balance - money < 0)
			System.out.print("출금 금액이 부족합니다.");
		else
			balance -= money;
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
	
}
