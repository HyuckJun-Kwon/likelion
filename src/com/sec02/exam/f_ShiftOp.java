package com.sec02.exam;

public class f_ShiftOp {

	public static void main(String[] args) {

		//Q1 . RGB 색상값을 하나의 int로 저장
		int r = 255, g = 128, b = 64;
		int rgb = (r<<16) | (g << 8) | b;
		System.out.println(Integer.toBinaryString(rgb)); // rgb값이 32bit 정수로 변환 문자열 리턴
		
		//Q2. XOR -> 간단한 암호화 복호화에 사용
		
		
		/*int x = 100;
		// x를 5비트 오른쪽으로 시프트 , 왼쪽 비트를 0으로 채움
		System.out.println(" x >> 5 value  = " + (x >> 5));

		int x1 = -100;

		// x를 5비트 오른쪽으로 시프트 , 왼쪽 비트를 1로 채움
		System.out.println(" x1 >> 5   value  = " + (x1 >> 5));

		// x를 5비트 오른쪽으로 시프트 ,왼쪽 비트를 0으로 채움
		System.out.println(" x1 >>> 5 value  = " + (x1 >>> 5));*/

	}

}
