package com.javaex.classtest;

public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song();
		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setYear(2010);
		s1.setComposer("이민수");
		s1.setTrack(3);
		s1.showInfo();
		
		Song s2 = new Song("거짓말", "BIGBAN");
		s2.setAlbum("Always");
		s2.setYear(2007);
		s2.setComposer("G-DRAGON");
		s2.setTrack(2);
		s2.showInfo();
		
		Song s3 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커 1집", "장범준", 2012, 4);
		s3.showInfo();
	}

}
