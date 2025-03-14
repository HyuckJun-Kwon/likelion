package com.sec12.labmbda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s); 
		c. accept ("abc");
		
		Consumer<String> c1 = s -> System.out.println("c1=" + s); 
		Consumer<String> c2 = s -> System.out.println("c2=" + s); 
		Consumer<String> c_res= c1. andThen (c2); 
		c_res.accept("abc");
		
		BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println("hap = " + (a+b));
		sum.accept(100, 200);
	}

}
