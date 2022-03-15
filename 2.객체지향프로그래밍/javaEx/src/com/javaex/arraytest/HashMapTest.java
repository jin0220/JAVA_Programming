package com.javaex.arraytest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		System.out.println(map);
		
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("mango", "망고");
		System.out.println(map);
		
		map.remove("apple");
		System.out.println(map);
		
		for(Entry<String,String> entry : map.entrySet()) {
			System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		
		while (iter.hasNext()) {
			 Map.Entry<String, String> entry = iter.next();
			 System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
		}
	}

}
