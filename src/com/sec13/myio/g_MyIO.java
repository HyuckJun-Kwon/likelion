package com.sec13.myio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//byte 단위로 읽고 쓰자
public class g_MyIO {

	public static void main(String[] args) {
		String filename = "./src/com/sec13/myio/g.txt"; 
		//File filename = new File("./d.txt");
		//System.out.println(filename.getPath());
		//System.out.println(filename.getAbsolutePath());
		try {
			//MyWrite(filename);
			MyReader(filename);
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

	private static void MyWrite(String filename) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
		for(char i = 'A'; i <= 'Z' ; i++) {
			bw.append(i);
		}
		bw.close();
		System.out.println("파일에 A~Z 저장했어 !!");
		
	}
	private static void MyReader(String filename) throws IOException {
		//라인단위로 읽겠다
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String data = null;
		System.out.println("파일에서 읽은 데이터");
		while((data = br.readLine()) != null){
			System.out.println(data);
		}
		br.close();
	}
	private static void MyReader02(String filename) throws IOException {
		//한글자씩 읽겠다
		BufferedReader br = new BufferedReader(new FileReader(filename));
		int data = 0;
		System.out.println("파일에서 읽은 데이터");
		while((data = br.read()) != -1){
			System.out.print((char)data + " ");
		}
		br.close();
	}

}
