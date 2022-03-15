package com.javaex.arraytest;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		list.add(3);
		list.add(2);
		list.addLast(100);
		list.addFirst(1);
		
		System.out.println(list);
		
		list.removeLast();
		
		list.removeFirst();
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println(list.contains(100));
		System.out.println(list.indexOf(200));

	}

}
