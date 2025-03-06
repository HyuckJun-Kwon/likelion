package com.sec04.exam;

public class a_IfTest {

	public static void main(String[] args) {
		// ex) 만일 a가 0보다 크면 "양수" 출력
		System.out.println("ex) 만일 a가 0보다 크면 \"양수\" 출력");
		int a = 100;
		if(a > 0) {
			System.out.println("양수");
		}
		
		// ex) 만일 a가 0보다 크면 "양수" 출력, 아니면 "아니잖아!!" 출력
		System.out.println("ex) 만일 a가 0보다 크면 \"양수\" 출력, 아니면 \"아니잖아!!\" 출력");
		if (a > 0) {
			System.out.println("양수");
		} else {
			System.out.println("아니잖아!!");
		}
		
		//ex) 만일 num가 0보다 크면 "양수" 출력, 0보다 작으면면 "음수", 다 아니면 "0입니다." 출력
		System.out.println("ex) 만일 num가 0보다 크면 \"양수\" 출력, 0보다 작으면면 \"음수\", 다 아니면 \"0입니다.\" 출력");
		int num = 10;
		if (num > 0) {
			System.out.println("양수");
		} else if(num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0입니다.");
		}
	}

}
