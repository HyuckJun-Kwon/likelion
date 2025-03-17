package com.sec12.mstream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FlatMapTest {
	
	public static void test_flatMap() {
		//flatmap 활용
		Path path = Paths.get("C:\\likelion\\MyJava\\JavaStudy\\src\\com\\sec12\\mstream\\a.txt");
		
		try (Stream<String> lines = Files.lines(path , StandardCharsets.UTF_8)){
			//파일의 각 줄을 공백 기준으로 단어를 분철해서 리턴
			//Stream<Stream<T>> -> 하나의 단일 스트림으로 Flatten 할 때 사용
			Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
		
			//결과 출력
			words.forEach(System.out::println);
			
		}catch(IOException e) {
			System.out.println("파일 X " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		//map 활용
		Path path = Paths.get("C:\\likelion\\MyJava\\JavaStudy\\src\\com\\sec12\\mstream\\a.txt");
		
		try (Stream<String> lines = Files.lines(path , StandardCharsets.UTF_8)){
			//파일의 각 줄을 공백 기준으로 단어를 분철해서 리턴
			//Stream<Stream<T>> -> 하나의 단일 스트림으로 Flatten 할 때 사용
			Stream<Stream<String>> words = lines.map(line -> Stream.of(line.split(" +")));
		
			//결과 출력
			words.forEach(innerStream -> innerStream.forEach(System.out::println));
			
		}catch(IOException e) {
			System.out.println("파일 X " + e.getMessage());
		}
	}
}


