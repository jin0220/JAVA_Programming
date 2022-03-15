package com.javaex.iostream;

/*
 * ���θ޼ҵ忡 �ڵ��ϱ�
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

  public static void main(String[] args) throws IOException {

    // �غ񿵿�
    Writer fw;
    BufferedWriter bw;
    String str;

    // ��ĳ��
    Scanner sc = new Scanner(System.in);

    // ������ �о ����Ʈ�� ��´�.
    String fileName = "C:\\Users\\hhh73\\StudioProjects\\JAVA_Programming\\5.IO��Ʈ��\\javaEx\\src\\com\\javaex\\iostream\\phoneDB.txt";
    Reader fr = new FileReader(fileName);
    BufferedReader br = new BufferedReader(fr);

    List<Person> pList = new ArrayList<Person>();

    while (true) {
      String line = br.readLine();
      if (line == null) {
        break;
      }

      String[] data = line.split(",");
      String name = data[0];
      String hp = data[1];
      String company = data[2];

      Person phone = new Person(name, hp, company);

      pList.add(phone);

    }

    // ����ȭ��
    System.out.println("******************************************");
    System.out.println("*            ��ȭ��ȣ ���� ���α׷�                            *");
    System.out.println("******************************************");

    // while ����
    boolean run = true;
    while (run) {
      // �޴� ���
      System.out.println("");
      System.out.println("1.����Ʈ  2.���  3.����  4.�˻�  5.����");
      System.out.println("------------------------------------------");
      System.out.print(">�޴���ȣ: ");

      // �޴� �Է�
      int menuNum = sc.nextInt();
      sc.nextLine();

      // switch() ����
      switch (menuNum) {

      // 1(����Ʈ)
      case 1:
        System.out.println("<1.����Ʈ>");
        for (int i = 0; i < pList.size(); i++) {
          System.out.print(i + 1 + ".   ");
          System.out.print(pList.get(i).getName() + "\t");
          System.out.print(pList.get(i).getHp() + "\t");
          System.out.print(pList.get(i).getCompany() + "\t");
          System.out.println("");
        }
        break;

      // 2(���)
      case 2:
        System.out.println("<2.���>");
        // �̸��ޱ�
        System.out.print(">�̸�: ");
        String name = sc.nextLine();
        // �޴���ȭ �ޱ�
        System.out.print(">�޴���ȭ: ");
        String hp = sc.nextLine();
        // ȸ���ȣ�ޱ�
        System.out.print(">ȸ����ȭ: ");
        String company = sc.nextLine();

        // ����Ʈ�� �߰��ϱ�
        Person person = new Person();
        person.setName(name);
        person.setHp(hp);
        person.setCompany(company);

        pList.add(person);

        // ���Ͽ� ����
        fw = new FileWriter(fileName);
        bw = new BufferedWriter(fw);

        // ���ڿ� �����
        str = "";
        for (int i = 0; i < pList.size(); i++) {
          str += pList.get(i).getName() + ",";
          str += pList.get(i).getHp() + ",";
          str += pList.get(i).getCompany() + "\n";

        }
        bw.write(str);
        bw.flush();
        System.out.println("[��ϵǾ����ϴ�.]");
        break;

      // 3(����)
      case 3:
        System.out.println("<3.����>");
        System.out.print(">��ȣ : ");
        int no = sc.nextInt();
        pList.remove(no - 1);

        // ���Ͽ� ����
        fw = new FileWriter(fileName);
        bw = new BufferedWriter(fw);

        // ���ڿ� �����
        str = "";
        for (int i = 0; i < pList.size(); i++) {
          str += pList.get(i).getName() + ",";
          str += pList.get(i).getHp() + ",";
          str += pList.get(i).getCompany() + "\n";

        }
        bw.write(str);
        bw.flush();
        System.out.println("[�����Ǿ����ϴ�.]");
        break;

      // 4(�˻�)
      case 4:
        System.out.println("<4.�˻�>");
        System.out.print(">�̸�: ");
        String keyword = sc.nextLine();

        for (int i = 0; i < pList.size(); i++) {
          String serchName = pList.get(i).getName();
          if (serchName.contains(keyword)) {
            System.out.print(i + 1 + ".   ");
            System.out.print(pList.get(i).getName() + "\t");
            System.out.print(pList.get(i).getHp() + "\t");
            System.out.print(pList.get(i).getCompany() + "\t");
            System.out.println("");
          }
        }

        break;

      // 5(����)
      case 5:
        System.out.println("����");
        run = false;
        break;
      // ���� ��ȣ�϶�
      default:
        System.out.println("[�ٽ� �Է��� �ּ���.]");
        break;

      }// switch() ����

    } // while ����
    br.close();
    sc.close();

    // ����ȭ��
    System.out.println("");
    System.out.println("******************************************");
    System.out.println("*                   �����մϴ�                             *");
    System.out.println("******************************************");
  }

}