package com.javaex.problem;

public class Base {
	public void service(String s) {
//		if(s.equals("낮"))
//			day();
//		else if(s.equals("밤"))
//			night();
//		else
//			afternoon();
		
		//null체크하는데 효과적
		if("낮".equals(s))
			day();
		else if("밤".equals(s))
			night();
		else if("오후".equals(s))
			afternoon();
	}
	
	public void day() {
		System.out.println("낮에는 열심히 일하자");
	}
	
	public void night() {
		System.out.println("night");
	}
	
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
}
