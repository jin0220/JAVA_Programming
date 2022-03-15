package com.javaex.arraytest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(null);
		list.add(1, 10);

//		System.out.println(list);
//		System.out.println(list.size());
		
//		list.remove(2);
		
//		System.out.println(list.get(1));
		
//		for(Integer i : list) {
//			System.out.println(i);
//		}
//		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));
		
		System.out.println(list.indexOf(1));
		System.out.println(list.indexOf(10));
	}

}
