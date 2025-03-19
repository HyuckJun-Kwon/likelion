package com.sec13.myNio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.List;

public class h_NIOChar {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\likelion\\MyJava\\JavaStudy\\src\\com\\sec13\\myNio\\b.txt");
		
		List<String> lines = List.of("public", "static", "void main");
		Files.write(path, lines);
		System.out.println("저장 완료");
		
		List<String> line02 = Files.readAllLines(path);
		line02.forEach(System.out::println);
		
		Runtime r = Runtime.getRuntime();
		r.exec("notepad.exe");
		

	}

}
