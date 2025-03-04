package com.sec01.exam;

//100과 200을 이용한 사칙연산 실습
public class c_exam {
		
	public static void main(String[] args) {
		//선언 -> 지역변수
		int a, b, sum, sub, mul, div;
		
		//값대입
		a = 100;
		b = 200;
		sum = sub = mul = div = 0;
		
		//연산
		sum = a + b;
		sub = b - a;
		mul = a * b;
		div = b / a;
		
		//출력
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(b + " - " + a + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(b + " / " + a + " = " + div);

	}


}
