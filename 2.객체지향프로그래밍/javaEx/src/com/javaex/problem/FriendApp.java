package com.javaex.problem;
import java.util.Scanner;
public class FriendApp {
    public static void main(String[] args) {
      
      Friend[] friendArray = new Friend[3];
        
      Scanner sc = new Scanner(System.in);
      System.out.println("ģ���� 3�� ����� �ּ���");
      // ģ������ �Է¹ޱ�
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      String str3 = sc.nextLine();
  
      // �Է¹��� ģ�������� �������� �и� String Ŭ������ split(" ") -> array
      String[] arr1 = str1.split(" ");
      String[] arr2 = str2.split(" ");
      String[] arr3 = str3.split(" ");
      
      // Friend ��ü �����Ͽ� ������ �ֱ� -> ������ ȣ�� -> ��ü ����
      Friend f1 = new Friend(arr1[0], arr1[1], arr1[2]);
      Friend f2 = new Friend(arr2[0], arr2[1], arr2[2]);
      Friend f3 = new Friend(arr3[0], arr3[1], arr3[2]);
      
      // �迭�� �߰��ϱ� ( friendArray <- friend��ü )
      friendArray[0] = f1;
      friendArray[1] = f2;
      friendArray[2] = f3;
      
      // ģ������ ���
      for (int i = 0; i < friendArray.length; i++) {
        //ģ������ ��� �޼ҵ� ȣ��
    	  friendArray[i].showInfo();
      }
      sc.close();
    }
}
