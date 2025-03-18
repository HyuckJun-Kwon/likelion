package com.sec13.myio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//byte 단위로 읽고 쓰자
public class d_MyIOStream {

	public static void main(String[] args) {
		String filename = "./src/com/sec13/myio/d.txt"; 
		//File filename = new File("./d.txt");
		//System.out.println(filename.getPath());
		//System.out.println(filename.getAbsolutePath());
		try {
			MyWrite(filename);
			MyReader(filename);
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

	private static void MyWrite(String filename) throws IOException {
		FileOutputStream fo = new FileOutputStream(filename);
		for(byte i = 'A'; i <= 'Z' ; i++) {
			fo.write(i);
		}
		fo.close();
		System.out.println("파일에 A~Z 저장했어 !!");
		
	}
	private static void MyReader(String filename) throws IOException {
		FileInputStream fi = new FileInputStream(filename);
		int data = 0;
		System.out.println("파일에서 읽은 데이터");
		while((data = fi.read()) != -1){
			System.out.print((char)data + " ");
		}
		fi.close();
		
	}

}
