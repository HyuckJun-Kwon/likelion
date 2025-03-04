package com.sec01.exam;

//100과 200을 이용한 사칙연산 실습
public class j_exam {
		
	public static void main(String[] args) {
		//선언 -> 지역변수
		int a, b, sum, sub, mul;
		double div;
		
		//값대입
		a = 100;
		b = 200;
		sum = sub = mul = 0;
		div = 0.0;
		
		//연산
		sum = Calc.getSum(a,b);
		sub = Calc.getSub(a,b);
		mul = Calc.getMul(a,b);
		div = Calc.getDiv(a,b);
		
		//출력
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(b + " - " + a + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(b + " / " + a + " = " + div);

	}


}
