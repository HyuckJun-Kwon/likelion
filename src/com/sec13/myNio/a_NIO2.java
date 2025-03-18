package com.sec13.myNio;

import java.nio.file.*;

public class a_NIO2 {

	public static void main(String[] args) throws Exception {
		//Q1. 특정 경로에 test 폴더 생성
		Path test = Paths.get("C:\\likelion\\MyJava\\JavaStudy\\src\\com\\sec13\\myNio\\test");
		Files.createDirectory(test);
		
		//Q2 test//AA 생성
		Path aadir = test.resolve("AA");
		Files.createDirectory(aadir);
		
		//Q3 test//bb 폴더 생성
		Path bbdir = test.resolve("BB");
		Files.createDirectory(bbdir);
		
		//Q4 test\\BB\\a.txt 파일 생성
		Path atxt = bbdir.resolve("a.txt");
		Files.createFile(atxt);
		System.out.println("다 만들었어");
		
		//Q5.삭제하기
		Files.delete(atxt);
		System.out.println("삭제 완료");


	}

}
