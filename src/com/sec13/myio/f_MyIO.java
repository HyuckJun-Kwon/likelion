package com.sec13.myio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//byte 단위로 읽고 쓰자
public class f_MyIO {

	public static void main(String[] args) {
		String filename = "./src/com/sec13/myio/f.txt"; 
		try {
			MyWrite(filename);
			MyReader(filename);
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

	private static void MyWrite(String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		for(byte i = 'A'; i <= 'Z' ; i++) {
			fw.write(i);
		}
		fw.close();
		System.out.println("파일에 A~Z 저장했어 !!");
		
	}
	private static void MyReader(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		int data = 0;
		System.out.println("파일에서 읽은 데이터");
		while((data = fr.read()) != -1){
			System.out.print((char)data + " ");
		}
		fr.close();
		
	}

}
