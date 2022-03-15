package com.javaex.iostream;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {0, '0', 'A', 'a'};
		System.out.println(add(x));
		System.out.println(x[3]);
	}
	
	public static int add(int arr[]) {
		int x = -1;
		for(int i = 0; i < arr.length; i++) {
			x = x < arr[i]? arr[i] : x;
		}
		return x;
	}

}
