package com.javaex.classtest;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		try {
			result = 100 / num;
		}catch(Exception e) {
			System.out.println("에러 발생 -> " + e.getMessage());
			result = 0;
		}

		System.out.println(result);
		
		sc.close();
	}

}
