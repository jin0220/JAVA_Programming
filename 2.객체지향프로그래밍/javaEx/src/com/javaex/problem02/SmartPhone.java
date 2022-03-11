package com.javaex.problem02;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        if("앱".equals(str))
        	app();
        else if("음악".equals(str))
        	playMusic();
        else 
        	super.execute(str);
    }
 
    public void app() {
    	System.out.println("앱실행");
    }
    
    // 오버라이딩
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
  
}
