package com.javaex.problem04;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		while(true) {
			System.out.print(">> ");
			
			String s = sc.nextLine();

			if ("/q".equals(s)) {
				System.out.println("종료합니다.");
				break;
			}
			
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[2]);
			String operation = s.split(" ")[1];
			
			if ("+".equals(operation)) {
				add.setValue(a, b);
				System.out.println(">> " + add.calculate());
			} else if ("-".equals(operation)) {
				sub.setValue(a, b);
				System.out.println(">> " + sub.calculate());
			} else if ("*".equals(operation)) {
				mul.setValue(a, b);
				System.out.println(">> " + mul.calculate());
			} else if ("/".equals(operation)) {
				div.setValue(a, b);
				System.out.println(">> " + div.calculate());
			} else {
				System.out.println("알 수 없는 연산입니다.");
			}
		}
		sc.close();
	}
}
