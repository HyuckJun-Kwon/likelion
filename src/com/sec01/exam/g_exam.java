package com.sec01.exam;

//각 리터럴에 맞는 값을 주면서 [자동형변환] 메소드 호출을 해보자.
// 리터럴이 대입된 타입을 알려면 자바에서 어떻게 사용해?
// - 래퍼클래스의 객체로 형변환 후 object 클래스가 가진 .getClass().getSimpleName()
public class g_exam {
	
	public static void prn01(long res) { //메소드를 호출할 때 정수값을 받으면서 지역변수 생성하여 값 대입
		System.out.println("정수 res = " + res);
	}
	
	public static void main(String[] args) {
		prn01(100);
		prn01('a');
		prn01((long)90.1);//명시형변환 이후 호출

	}

}
