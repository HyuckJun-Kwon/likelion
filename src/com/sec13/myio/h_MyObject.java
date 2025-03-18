package com.sec13.myio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Object 단위로 읽고 쓰자
public class h_MyObject {

	public static void main(String[] args) {
		String filename = "./src/com/sec13/myio/h.txt"; 
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
		ObjectOutputStream bo = new ObjectOutputStream(new FileOutputStream(filename));
		for(byte i = 'A'; i <= 'Z' ; i++) {
			bo.writeByte(i);
		}
		bo.close();
		System.out.println("파일에 A~Z 저장했어 !!");
		
	}
	private static void MyReader(String filename) throws IOException {
		ObjectInputStream bi = new ObjectInputStream(new FileInputStream(filename));
		int data = 0;
		System.out.println("파일에서 읽은 데이터");
		while((data = bi.readByte()) != -1){
			System.out.print((char)data + " ");
		}
		bi.close();
		
	}

}
