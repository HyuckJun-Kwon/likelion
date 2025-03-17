package com.sec12.mstream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceTest02 {
    //reduce를 사용하여 문제를 풀어 보자.  데이터를 Arrays.asList()로 나열한다. 
    public static void main(String[] args) {
        //Q1
    	System.out.println("Q1️. {3, 7, 2, 9, 5, 8}에서 reduce()를 사용하여 최댓값을 구해보자");  
        List<Integer> numbers1 = Arrays.asList(3, 7, 2, 9, 5, 8);
        Optional <Integer> max = numbers1.stream().reduce(Integer::max);
        max.ifPresent(m -> System.out.println("최대값 : " + m));
        System.out.println();
        
        //Q2
        System.out.println("Q2. {\"Java\", \"Stream\", \"Reduce\", \"Example\"}에서 reduce()를 사용하여 문자열을 하나로 연결하자");
        List<String> words = Arrays.asList("Java", "Stream", "Reduce", "Example");
        Optional<String> str = words.stream().reduce((a, b) -> a + " " + b);
        str.ifPresent(s -> System.out.println("문자열 : " + s));
        System.out.println();
        
        //Q3
        System.out.println("Q3. {2, 3, 4, 5}에서 reduce()를 사용하여 모든 값을 곱한 결과를 구하자");
        List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5);
        int res = numbers3.stream().reduce(1, (a, b) -> a * b);
        System.out.println(res);
        System.out.println();
        
        //Q4
        System.out.println("Q4. {1, 2, 3, 4, 5}에서 reduce()를 사용하여 모든 숫자의 제곱 합을 구하자");
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        int res2 = numbers4.stream().map(e -> e * e).reduce(0,Integer::sum);
        System.out.println(res2);
        System.out.println();
        
        //Q5
        System.out.println("Q5. {\"hello\", \"world\", \"java\", \"stream\"}에서 reduce()를 사용하여 모든 단어의 길이의 합을 구하자");
        List<String> words5 = Arrays.asList("hello", "world", "java", "stream");
        int res3 = words5.stream().map(String::length).reduce(0, Integer::sum);
        System.out.println(res3);
        System.out.println();
        
        //Q6        
        System.out.println("Q6. {\"apple\", \"banana\", \"cherry\", \"date\"}에서 reduce()를 사용하여 가장 긴 문자열을 찾자");
        List<String> words6 = Arrays.asList("apple", "banana", "cherry", "date");
        Optional<String> res4 = words6.stream().reduce((a, b) -> a.length() >= b.length() ? a : b);
        res4.ifPresent(e -> System.out.println("가장 긴 단어 : " + e));
        System.out.println();
    }
}
