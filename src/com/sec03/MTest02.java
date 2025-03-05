package com.sec03;

import java.util.Random;
import java.math.*;

public class MTest02 {

	public static void main(String[] args) {
		//Integer i = new Integer(100);
		Integer i = 100;
		System.out.println(i.doubleValue());
		
		Integer i2 = new Integer("100");
		System.out.println(i2.doubleValue());
		
		String str = "abcdefg";//String str = new String("abcdefg");//str이라는 객체 생성
		System.out.println("길이 = " + str.length());
		System.out.println("전체 대문자 = " + str.toUpperCase());
		
		String res = str.toUpperCase();
		System.out.println("출력 : " + res + " -> 소문자로 : " + res.toLowerCase());
		
		Random ran = new Random();
		int num = ran.nextInt(101);
		System.out.println(num);
		
		
		int r2 = (int)(101 * Math.random());
		System.out.println(r2);

	}

}
