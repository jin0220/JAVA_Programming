package com.javaex.classtest;

public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song();
		s1.setTitle("������");
		s1.setArtist("������");
		s1.setAlbum("Real");
		s1.setYear(2010);
		s1.setComposer("�̹μ�");
		s1.setTrack(3);
		s1.showInfo();
		
		Song s2 = new Song("������", "BIGBAN");
		s2.setAlbum("Always");
		s2.setYear(2007);
		s2.setComposer("G-DRAGON");
		s2.setTrack(2);
		s2.showInfo();
		
		Song s3 = new Song("���ɿ���", "����Ŀ����Ŀ", "����Ŀ����Ŀ 1��", "�����", 2012, 4);
		s3.showInfo();
	}

}
