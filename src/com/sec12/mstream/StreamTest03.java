package com.sec12.mstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest03 {
    public static void main(String[] args) {
    	// 1~10까지 정수형 값을 스트림생성 후 출력
    	Integer [] int_array = {1,2,3,4,5,6,7,8,9,10};
    	Stream<String> streamFromValues = Arrays.stream(int_array).map(String::valueOf);
    	StreamTest.printStream("1~10까지 정수형 값을 스트림생성 후 출력", streamFromValues);
    	
    	//"import java.util.stream.Stream"는 문자열 잘라서 배열 만든 후 스트림 생성 후 출력
    	String[] stringArray = "import java.util.stream.Stream".split(" ");
    	Stream<String> stream2 = Arrays.stream(stringArray);
    	StreamTest.printStream("import java.util.stream.Stream는 문자열 잘라서 배열 만든 후 스트림 생성 후 출력", stream2);
    	
    	// 10~1까지 정수형 값을 스트림생성 후 출력
    	Integer [] int_array2 = {10,9,8,7,6,5,4,3,2,1};
    	Stream<String> streamFromValues2 = Arrays.stream(int_array2).map(String::valueOf);
    	StreamTest.printStream("10~1까지 정수형 값을 스트림생성 후 출력", streamFromValues2);
    }
}
