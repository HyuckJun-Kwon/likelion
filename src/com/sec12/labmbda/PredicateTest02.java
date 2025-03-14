package com.sec12.labmbda;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;


public class PredicateTest02 {

	public static void main(String[] args) {
		//짝수이면서 7의 배수인지 판별
		
		// 짝수인지 판별
		IntPredicate isE = n -> (n % 2) == 0;
		
		// 7의 배수인지 판별
		IntPredicate isM7 = n -> (n % 7) == 0;
		    
		//두 조건을 .and()로 연결하여 result에 대입
		IntPredicate result = isE.and(isM7);
		    
		System.out.println(result.test(100));
		System.out.println(result.test(28));
		System.out.println(result.test(21));
		
		
		//x가 y보다 큰 지 확인
		BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
		System.out.println(bi.test(10, 7));
		    
		  
	}

}
