package com.sec12.labmbda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest01 {

	public static void main(String[] args) {
		 BiFunction<String, String,String> bi = (x, y) -> {      
		      return x + y;
		    };
		    
		    String res = bi.apply("오늘은 ", "금요일이다.");
		    
		    System.out.println("bi = " + res);
		    
		    Function<String,String> f = x-> x+" !";		    
		    System.out.println(bi.andThen(f).andThen(f).apply("Getting Start", " java"));
	}
}
