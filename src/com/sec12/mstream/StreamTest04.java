package com.sec12.mstream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
    	// 1~10까지 정수형 값을 스트림생성 후 출력
    	Stream<String> streamFromValues = IntStream.rangeClosed(1, 10).mapToObj(String::valueOf);
    	StreamTest.printStream("1~10까지 정수형 값을 스트림생성 후 출력", streamFromValues);
    	
    	// 10~1까지 정수형 값을 스트림생성 후 출력
    	Stream<String> streamFromValues2 = IntStream.iterate(10, i->i-1).limit(10).mapToObj(String::valueOf);
    	StreamTest.printStream("10~1까지 정수형 값을 스트림생성 후 출력", streamFromValues2);
    	
    	Stream<String> streamFromValues3 = IntStream.rangeClosed(1, 10).map(i->11-i).mapToObj(String::valueOf);
    	//Stream<String> streamFromValues3 = IntStream.rangeClosed(1, 10).boxed().sorted((a, b) -> b-a).map(String::valueOf);
    	StreamTest.printStream("10~1까지 정수형 값 스트림 다르게 생성 후 출력", streamFromValues3);
    }
}
