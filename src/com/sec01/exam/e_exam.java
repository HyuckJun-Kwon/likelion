package com.sec01.exam;

//100과 200을 이용한 사칙연산 실습
//조건 1 : div 결과는 double로
//조건 2 : 수행결과를 calc()로 구현해서 메인 메소드에서 호출하자
public class e_exam {
		
	public static void calc() {
		//선언 -> 지역변수
		int a, b, sum, sub, mul;
		double div;
		
		//값대입
		a = 100;
		b = 200;
		sum = sub = mul = 0;
		div = 0.0;
		
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
	public static void calc02() {
		//선언 -> 지역변수
		int a, b, sum, sub, mul;
		double div;
		
		//값대입
		a = 100;
		b = 200;
		sum = sub = mul = 0;
		div = 0.0;
		
		//연산
		sum = a + b;
		sub = b - a;
		mul = a * b;
		div = b / a;
		
		//출력
		System.out.printf("%d + %d = %d\n", a,b,sum);
		System.out.printf("%d - %d = %d\n", b,a,sub);
		System.out.printf("%d * %d = %d\n", a,b,mul);
		System.out.printf("%d / %d = %.2f\n", b,a,div);

	}
	public static void main(String[] args) {
		calc();
		calc02();
	}


}
