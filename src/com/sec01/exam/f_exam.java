package com.sec01.exam;

public class f_exam {
	
	public static void prn01(int res) { //메소드를 호출할 때 정수값을 받으면서 지역변수 생성하여 값 대입
		System.out.println("정수 res = " + res);
	}
	public static void prn02(char res) { //메소드를 호출할 때 문자값을 받으면서 지역변수 생성하여 값 대입
		System.out.println("한 문자 res = " + res);
	}
	public static void prn03(double res) { //메소드를 호출할 때 실수값을 받으면서 지역변수 생성하여 값 대입
		System.out.println("실수 res = " + res);
	}

	public static void main(String[] args) {
		prn01(100);
		prn02('a');
		prn03(90.1);

	}

}
