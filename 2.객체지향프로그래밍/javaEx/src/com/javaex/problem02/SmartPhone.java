package com.javaex.problem02;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        if("��".equals(str))
        	app();
        else if("����".equals(str))
        	playMusic();
        else 
        	super.execute(str);
    }
 
    public void app() {
    	System.out.println("�۽���");
    }
    
    // �������̵�
    public void playMusic() {
    	System.out.println("�ٿ�ε��ؼ� �������");
    }
  
}
