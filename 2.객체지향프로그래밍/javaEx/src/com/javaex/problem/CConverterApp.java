package com.javaex.problem;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1229.20);
        
        dollar = 100;
        won = 1000000;
        
        //�鸸���� �޷��� ���
        System.out.println("�鸸���� " + CConverter.toDoller(won) + "�޷��Դϴ�.");
        
        //100�޷��� ������ ���
        System.out.println("��޷��� " + CConverter.toKRW(dollar) + "�Դϴ�.");
        
    }

}
