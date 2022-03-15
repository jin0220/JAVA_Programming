package com.javaex.arraytest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<>();
//		
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		System.out.println(set);
//		
//		set.remove(2);
//		System.out.println(set);
//		
//		System.out.println(set.size());
//		
//		Iterator iter = set.iterator();
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		HashSet<Integer> set = new HashSet<>();
		
		while(true) {
			if(set.size() == 6) {
				System.out.println(set);
				break;
			}
			set.add((int)(Math.random() * 45) + 1);
			System.out.println(set);
		}
		
	}

}
